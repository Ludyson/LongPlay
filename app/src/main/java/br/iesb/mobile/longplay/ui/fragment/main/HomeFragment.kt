package br.iesb.mobile.longplay.ui.fragment.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.navigation.fragment.findNavController
import androidx.viewpager2.adapter.FragmentStateAdapter
import br.iesb.mobile.longplay.R
import br.iesb.mobile.longplay.databinding.FragmentHomeBinding
import br.iesb.mobile.longplay.databinding.FragmentOnboardingBinding
import br.iesb.mobile.longplay.ui.fragment.main.onboardinghome.AlbumDoisFragment
import br.iesb.mobile.longplay.ui.fragment.main.onboardinghome.AlbumTresFragment
import br.iesb.mobile.longplay.ui.fragment.main.onboardinghome.AlbumUmFragment
import br.iesb.mobile.longplay.ui.fragment.onboarding.AdaptadorParaConversarComVP
import br.iesb.mobile.longplay.ui.fragment.onboarding.screen.OnboardingSecondFragment
import br.iesb.mobile.longplay.ui.fragment.onboarding.screen.OnboardingThirdFragment
import br.iesb.mobile.longplay.ui.fragment.onboarding.screen.OnbordingFirstFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding

    @Suppress("UNUSED_PARAMETER")
    fun entrarPerfil() {
        findNavController().navigate(R.id.action_homeFragment_to_perfilHomeFragment)
    }

    @Suppress("UNUSED_PARAMETER")
    fun entrarConf() {
        findNavController().navigate(R.id.action_homeFragment_to_confHomeFragment)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        binding.codigoDoFragmento = this
        binding.lifecycleOwner = this

        //Fonte de Dados
        val listaFragmentos = listOf(
            AlbumUmFragment(),
            AlbumDoisFragment(),
            AlbumTresFragment()
        )

        //Adptador
        val adaptador = AdaptadorParaConversarComVP(listaFragmentos, requireActivity().supportFragmentManager, lifecycle)

        binding.vpHome.adapter = adaptador

        return binding.root
    }
}

class AdaptadorParaConversarComVP(val listaFragmentos: List<Fragment>, fragmentManager: FragmentManager, lifecycle: Lifecycle) : FragmentStateAdapter(fragmentManager, lifecycle){
    override fun getItemCount() = listaFragmentos.size
    override fun createFragment(position: Int) = listaFragmentos[position]
}