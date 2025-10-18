package com.niyaz.zario

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.niyaz.zario.databinding.ActivityMainBinding
import com.niyaz.zario.core.evaluation.EvaluationRepository
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    
    private lateinit var binding: ActivityMainBinding
    private lateinit var navController: NavController
    
    @Inject lateinit var evaluationRepository: EvaluationRepository

    companion object {
        private const val TAG = "MainActivity"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        
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
    
    private fun handleNavigationIntent() {
        // Handle navigation from notifications
        val navigateTo = intent.getStringExtra("navigate_to") ?: return

        lifecycleScope.launch {
            if (navigateTo == "feedback" && evaluationRepository.hasUnviewedCompletedEvaluation()) {
                val currentDestination = navController.currentDestination?.id
                if (currentDestination != R.id.feedbackFragment) {
                    navController.navigate(R.id.splashFragment)
                }
            }
            intent.removeExtra("navigate_to")
        }
    }
} 