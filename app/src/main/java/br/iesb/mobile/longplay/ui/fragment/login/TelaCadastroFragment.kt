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
import br.iesb.mobile.longplay.databinding.FragmentTelaCadastroBinding
import br.iesb.mobile.longplay.domain.LoginResult
import br.iesb.mobile.longplay.viewmodel.LoginViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class TelaCadastroFragment : Fragment() {

    private lateinit var binding: FragmentTelaCadastroBinding
    private val viewmodel: LoginViewModel by viewModels()

    @Suppress("UNUSED_PARAMETER")
    fun fazerCadastro(v: View) {
        viewmodel.signup()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentTelaCadastroBinding.inflate(inflater,container,false)
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
                    Toast.makeText(context, getText(R.string.signup_successfully), Toast.LENGTH_LONG).show()
                }
                is LoginResult.Error -> Toast.makeText(context, it.message, Toast.LENGTH_LONG).show()
            }
        }
    }
}