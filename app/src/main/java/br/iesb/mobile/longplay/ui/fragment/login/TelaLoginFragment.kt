package br.iesb.mobile.longplay.ui.fragment.login

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import br.iesb.mobile.longplay.R
import br.iesb.mobile.longplay.databinding.FragmentTelaLoginBinding
import br.iesb.mobile.longplay.domain.LoginResult
import br.iesb.mobile.longplay.viewmodel.LoginViewModel
import com.google.firebase.auth.FirebaseAuth
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class TelaLoginFragment : Fragment() {

    @Inject
    lateinit var auth: FirebaseAuth

    private lateinit var binding: FragmentTelaLoginBinding
    private val viewmodel: LoginViewModel by viewModels()

    @Suppress("UNUSED_PARAMETER")
    fun fazerLogin(v: View) {
        viewmodel.login()
    }

    @Suppress("UNUSED_PARAMETER")
    fun iniciarCadastro(v: View) {
        findNavController().navigate(R.id.action_telaLoginFragment_to_telaCadastroFragment)
    }

    @Suppress("UNUSED_PARAMETER")
    fun recuperarSenha(v: View) {
        findNavController().navigate(R.id.action_telaLoginFragment_to_telaRecupararFragment)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentTelaLoginBinding.inflate(inflater,container,false)
        binding.codigoDoFragmento = this
        binding.lifecycleOwner = this
        binding.viewmodel = viewmodel

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewmodel.result.observe(viewLifecycleOwner) {
            when (it) {
                is LoginResult.Success -> {
                    requireActivity().finish()
                    findNavController().navigate(R.id.action_telaLoginFragment_to_mainActivity)
                }
                is LoginResult.Error -> Toast.makeText(context, it.message, Toast.LENGTH_LONG).show()
            }
        }
    }
}