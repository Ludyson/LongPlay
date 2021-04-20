package br.iesb.mobile.longplay.ui.fragment.onboarding.screen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.iesb.mobile.longplay.databinding.FragmentOnbordingFirstBinding

class OnbordingFirstFragment : Fragment() {

    private lateinit var binding: FragmentOnbordingFirstBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        binding = FragmentOnbordingFirstBinding.inflate(inflater, container, false)
        binding.lifecycleOwner = this

        return binding.root
    }
}