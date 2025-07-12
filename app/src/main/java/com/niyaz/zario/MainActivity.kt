package com.niyaz.zario

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.NavController
import com.niyaz.zario.databinding.ActivityMainBinding
import com.niyaz.zario.repository.EvaluationRepository
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    
    private lateinit var binding: ActivityMainBinding
    private lateinit var navController: NavController
    @Inject lateinit var evaluationRepository: EvaluationRepository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        
        setupNavigation()
        handleNavigationIntent()
    }

    private fun setupNavigation() {
        val navHostFragment = supportFragmentManager
            .findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        navController = navHostFragment.navController
        // Removed action bar setup to prevent overlap with UI
    }
    
    private fun handleNavigationIntent() {
        // Handle navigation from notifications
        val navigateTo = intent.getStringExtra("navigate_to")
        if (navigateTo == "feedback") {
            // Only navigate to feedback if there's actually an unviewed completed evaluation
            // Otherwise, let the normal splash flow handle navigation
            if (evaluationRepository.hasUnviewedCompletedEvaluation()) {
                val currentDestination = navController.currentDestination?.id
                if (currentDestination != R.id.feedbackFragment) {
                    // Navigate to feedback via splash to ensure proper navigation flow
                    navController.navigate(R.id.splashFragment)
                }
            }
            // If no unviewed evaluation, clear the intent extra to prevent re-triggering
            intent.removeExtra("navigate_to")
        }
    }
} 