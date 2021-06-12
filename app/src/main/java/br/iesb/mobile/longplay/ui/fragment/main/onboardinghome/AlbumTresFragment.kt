package br.iesb.mobile.longplay.ui.fragment.main.onboardinghome

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.iesb.mobile.longplay.R
import br.iesb.mobile.longplay.databinding.FragmentAlbumTresBinding
import br.iesb.mobile.longplay.databinding.FragmentOnboardingThirdBinding

class AlbumTresFragment : Fragment() {

    private lateinit var binding: FragmentAlbumTresBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentAlbumTresBinding.inflate(inflater, container, false)
        binding.lifecycleOwner = this

        return binding.root
    }
}