package br.iesb.mobile.longplay.ui.fragment.onboarding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.navigation.fragment.findNavController
import androidx.viewpager2.adapter.FragmentStateAdapter
import br.iesb.mobile.longplay.R
import br.iesb.mobile.longplay.databinding.FragmentOnboardingBinding
import br.iesb.mobile.longplay.ui.fragment.onboarding.screen.OnboardingSecondFragment
import br.iesb.mobile.longplay.ui.fragment.onboarding.screen.OnboardingThirdFragment
import br.iesb.mobile.longplay.ui.fragment.onboarding.screen.OnbordingFirstFragment

class OnboardingFragment : Fragment() {

    private lateinit var binding: FragmentOnboardingBinding

    fun startLogin(v: View) {
        findNavController().navigate(R.id.action_onboardingFragment_to_telaLoginFragment)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentOnboardingBinding.inflate(inflater, container, false)
        binding.codigoDoFragmento = this
        binding.lifecycleOwner = this

        //Fonte de Dados
        val listaFragmentos = listOf(
            OnbordingFirstFragment(),
            OnboardingSecondFragment(),
            OnboardingThirdFragment()
        )

        //Adptador
        val adaptador = AdaptadorParaConversarComVP(listaFragmentos, requireActivity().supportFragmentManager, lifecycle)

        binding.vpOnboarding.adapter = adaptador

        return binding.root
    }
}

class AdaptadorParaConversarComVP(val listaFragmentos: List<Fragment>,fragmentManager: FragmentManager, lifecycle: Lifecycle) : FragmentStateAdapter(fragmentManager, lifecycle){
    override fun getItemCount() = listaFragmentos.size
    override fun createFragment(position: Int) = listaFragmentos[position]
}