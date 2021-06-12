package br.iesb.mobile.longplay.ui.fragment.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.iesb.mobile.longplay.R
import br.iesb.mobile.longplay.databinding.FragmentConfHomeBinding
import br.iesb.mobile.longplay.databinding.FragmentOnboardingBinding

class ConfHomeFragment : Fragment() {

    private lateinit var binding: FragmentConfHomeBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentConfHomeBinding.inflate(inflater, container, false)
        binding.codigoDoFragmento = this
        binding.lifecycleOwner = this

        return binding.root
    }
}