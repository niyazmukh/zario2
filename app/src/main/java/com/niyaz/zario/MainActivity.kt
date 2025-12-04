package com.niyaz.zario

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.launch
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.niyaz.zario.databinding.ActivityMainBinding
import com.niyaz.zario.monitoring.EngagementEventLogger
import com.niyaz.zario.data.local.entities.NotificationCategory
import com.niyaz.zario.data.local.entities.NotificationEventType
import com.niyaz.zario.monitoring.NotificationInteractionReceiver
import org.json.JSONObject
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import com.niyaz.zario.core.evaluation.EvaluationRepository

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    
    private lateinit var binding: ActivityMainBinding
    private lateinit var navController: NavController
    
    @Inject lateinit var evaluationRepository: EvaluationRepository
    @Inject lateinit var engagementEventLogger: EngagementEventLogger

    companion object {
        private const val TAG = "MainActivity"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge()
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        applyEdgeToEdgeInsets()
        
        setupNavigation()
        handleNavigationIntent()
        // Removed intrusive permission checks - handled by SplashFragment navigation
    }

    private fun setupNavigation() {
        val navHostFragment = supportFragmentManager
            .findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        navController = navHostFragment.navController
        // Removed action bar setup to prevent overlap with UI
    }

    private fun applyEdgeToEdgeInsets() {
        ViewCompat.setOnApplyWindowInsetsListener(binding.root) { view, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            view.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
    
    private fun handleNavigationIntent() {
        // Handle navigation from notifications
        val navigateTo = intent.getStringExtra("navigate_to")
        
        // Log notification tap if metadata is present
        val notificationId = intent.getIntExtra(NotificationInteractionReceiver.EXTRA_NOTIFICATION_ID, 0)
        if (notificationId != 0) {
            val categoryStr = intent.getStringExtra(NotificationInteractionReceiver.EXTRA_CATEGORY)
            val category = categoryStr?.let { runCatching { NotificationCategory.valueOf(it) }.getOrNull() }
                ?: NotificationCategory.UNKNOWN
            val channelId = intent.getStringExtra(NotificationInteractionReceiver.EXTRA_CHANNEL_ID) ?: ""
            val metadataJson = intent.getStringExtra(NotificationInteractionReceiver.EXTRA_METADATA)
            
            val metadata = if (!metadataJson.isNullOrBlank()) {
                runCatching {
                    val json = JSONObject(metadataJson)
                    val map = mutableMapOf<String, Any?>()
                    json.keys().forEach { key -> map[key] = json.get(key) }
                    map.toMap()
                }.getOrElse { emptyMap() }
            } else {
                emptyMap()
            }

            engagementEventLogger.logNotificationEvent(
                eventType = NotificationEventType.TAPPED,
                category = category,
                notificationId = notificationId,
                channelId = channelId,
                metadata = metadata
            )
            
            // Clear the ID so we don't log again on recreation
            intent.removeExtra(NotificationInteractionReceiver.EXTRA_NOTIFICATION_ID)
        }

        if (navigateTo == null) return

        lifecycleScope.launch {
            val currentDest = navController.currentDestination?.id
            val isAtSplash = currentDest == R.id.splashFragment

            if (navigateTo == "feedback" && evaluationRepository.hasUnviewedCompletedEvaluation()) {
                if (currentDest != R.id.feedbackFragment && !isAtSplash) {
                    navController.navigate(R.id.splashFragment)
                }
            } else if (navigateTo == "intervention") {
                if (currentDest != R.id.interventionFragment && !isAtSplash) {
                    navController.navigate(R.id.splashFragment)
                }
            }
            intent.removeExtra("navigate_to")
        }
    }
} 
