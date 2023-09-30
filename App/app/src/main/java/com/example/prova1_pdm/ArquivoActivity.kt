package com.example.prova1_pdm

import android.content.ContentValues
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.prova1_pdm.databinding.ActivityArquivoBinding

class ArquivoActivity : AppCompatActivity() {

    private lateinit var binding: ActivityArquivoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityArquivoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnCriarA.setOnClickListener {

        }

        binding.btnMostrarA.setOnClickListener {

        }

    }
}