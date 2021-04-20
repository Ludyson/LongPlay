package br.iesb.mobile.longplay

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import br.iesb.mobile.longplay.databinding.FragmentTelaLoginBinding
import com.google.firebase.auth.FirebaseAuth

class TelaLoginFragment : Fragment() {

    private lateinit var binding: FragmentTelaLoginBinding

    fun fazerLogin(v: View) {
       // login()
    }

    fun iniciarCadastro(v: View) {
        findNavController().navigate(R.id.action_telaLoginFragment_to_telaCadastroFragment)
    }

    fun recuperarSenha(v: View) {
        findNavController().navigate(R.id.action_telaLoginFragment_to_telaRecupararFragment)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTelaLoginBinding.inflate(inflater,container,false)
        binding.codigoDoFragmento = this
        binding.lifecycleOwner = this

        return binding.root
    }
/*
    private fun login(){
        val email = emailLogin.text.toString()
        val senha = passwordLogin.text.toString()
        val auth = FirebaseAuth.getInstance()

        val taskDeLogin = auth.signInWithEmailAndPassword(email,senha)

        taskDeLogin.addOnCompleteListener { resultado ->
            if(resultado.isSuccessful) {
                findNavController().navigate(R.id.action_telaLoginFragment_to_mainActivity)
            }else{
                Toast.makeText(this, "Erro de Login", Toast.LENGTH_LONG).show()
            }
        }
    }*/
}