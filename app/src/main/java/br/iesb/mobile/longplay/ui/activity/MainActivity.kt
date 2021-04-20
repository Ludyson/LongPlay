package br.iesb.mobile.longplay.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.iesb.mobile.longplay.R
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.WithFragmentBindings

@AndroidEntryPoint
@WithFragmentBindings
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

}