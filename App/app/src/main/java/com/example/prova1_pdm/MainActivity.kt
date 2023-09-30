package com.example.prova1_pdm

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.prova1_pdm.databinding.ActivityMainBinding
import androidx.activity.result.ActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.annotation.RequiresApi

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Lista.lista.add(Estabelecimento(Lista.id, "-", "-", 0F))
        Lista.id++
        Lista.lista.add(Posto(Lista.id, "fon", "987", 103.3F, 10000F))
        Lista.id++
        Lista.lista.add(Cinema(Lista.id, "zzz", "123", 9000F, 50))
        Lista.id++
        Lista.lista.add(Supermercado(Lista.id, "daleee", "9999", 1023.3F, true))
        Lista.id++
        Lista.lista.add(Posto(Lista.id, "fon", "987", 103.3F, 10000F))
        Lista.id++
        Lista.lista.add(Cinema(Lista.id, "zzz", "123", 9000F, 50))
        Lista.id++
        Lista.lista.add(Supermercado(Lista.id, "daleee", "9999", 1023.3F, true))
        Lista.id++
        Lista.lista.add(Posto(Lista.id, "fon", "987", 103.3F, 10000F))
        Lista.id++
        Lista.lista.add(Cinema(Lista.id, "zzz", "123", 9000F, 50))
        Lista.id++
        Lista.lista.add(Supermercado(Lista.id, "daleee", "9999", 1023.3F, true))
        Lista.id++


        binding.btnInserir.setOnClickListener {
            val intent = Intent(this, InserirActivity::class.java)
            startActivity(intent)
        }

        binding.btnMostrar.setOnClickListener {
            val intent = Intent(this, MostrarActivity::class.java)
            startActivity(intent)
        }

        binding.btnArquivo.setOnClickListener {
            val intent = Intent(this, ArquivoActivity::class.java)
            startActivity(intent)
        }
    }
}