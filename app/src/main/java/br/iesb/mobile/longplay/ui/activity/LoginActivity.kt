package br.iesb.mobile.longplay.ui.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import br.iesb.mobile.longplay.R
import com.google.firebase.auth.FirebaseAuth

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
/*
        btLogin.setOnClickListener {
            login()
        }

        btCadastrar.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
        }

        tvRecuperar.setOnClickListener {
            startActivity(Intent(this, RecoveryActivity::class.java))
        }*/
    }
/*
    private fun login(){
        val email = emailLogin.text.toString()
        val senha = passwordLogin.text.toString()
        val auth = FirebaseAuth.getInstance()

        val taskDeLogin = auth.signInWithEmailAndPassword(email,senha)

        taskDeLogin.addOnCompleteListener { resultado ->
            if(resultado.isSuccessful) {
                startActivity(Intent(this, HomeActivity::class.java))
            }else{
                Toast.makeText(this, "Erro de Login", Toast.LENGTH_LONG).show()
            }
        }
    }*/
}