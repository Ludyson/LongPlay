package br.iesb.mobile.longplay.ui.fragment.main.onboardinghome

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.iesb.mobile.longplay.R
import br.iesb.mobile.longplay.databinding.FragmentAlbumUmBinding
import br.iesb.mobile.longplay.databinding.FragmentOnboardingThirdBinding

class AlbumUmFragment : Fragment() {

    private lateinit var binding: FragmentAlbumUmBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentAlbumUmBinding.inflate(inflater, container, false)
        binding.lifecycleOwner = this

        return binding.root
    }
}