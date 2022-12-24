package com.example.inyecciondependenciastaller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.inyecciondependenciastaller.databinding.ActivityMainBinding
import com.example.inyecciondependenciastaller.model.Agenda
import com.example.inyecciondependenciastaller.model.Contacto
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var texto = ""

    //Lo que va a ser inyectado a partir de las dependencias
    @Inject lateinit var contacts: List<Contacto>
    @Inject lateinit var agenda: Agenda

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        agenda.contacts.forEach {
            texto += it
        }
        binding.txtDatos.text = texto
    }
}


























