package br.iesb.mobile.longplay.ui.fragment.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.iesb.mobile.longplay.R
import br.iesb.mobile.longplay.databinding.FragmentConfHomeBinding
import br.iesb.mobile.longplay.databinding.FragmentPerfilHomeBinding

class PerfilHomeFragment : Fragment() {

    private lateinit var binding: FragmentPerfilHomeBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentPerfilHomeBinding.inflate(inflater, container, false)
        binding.codigoDoFragmento = this
        binding.lifecycleOwner = this

        return binding.root
    }
}