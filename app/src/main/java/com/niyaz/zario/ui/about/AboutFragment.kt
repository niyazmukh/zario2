package com.niyaz.zario.ui.about

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.google.android.material.snackbar.Snackbar
import com.niyaz.zario.Constants
import com.niyaz.zario.R
import com.niyaz.zario.databinding.FragmentAboutBinding

class AboutFragment : Fragment() {

    private var _binding: FragmentAboutBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentAboutBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnContact.setOnClickListener { sendContactEmail() }
    }

    private fun sendContactEmail() {
        val emailAddress = Constants.CONTACT_EMAIL_SUPPORT
        val emailIntent = Intent(Intent.ACTION_SENDTO).apply {
            data = Uri.parse("mailto:$emailAddress")
            putExtra(Intent.EXTRA_EMAIL, arrayOf(emailAddress))
            putExtra(Intent.EXTRA_SUBJECT, getString(R.string.about_title))
        }

        try {
            startActivity(Intent.createChooser(emailIntent, getString(R.string.about_contact_chooser_title)))
        } catch (ex: ActivityNotFoundException) {
            view?.let { root ->
                Snackbar.make(root, R.string.about_contact_error, Snackbar.LENGTH_SHORT).show()
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
