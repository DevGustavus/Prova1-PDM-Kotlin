package com.example.prova1_pdm

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcelable
import android.util.Log
import androidx.annotation.RequiresApi
import com.example.prova1_pdm.databinding.ActivityInserirBinding
import kotlin.collections.ArrayList
import java.io.Serializable

class InserirActivity : AppCompatActivity() {

    private lateinit var binding: ActivityInserirBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInserirBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSupermercado.setOnClickListener {
            val nomes = binding.etNome.text.toString()
            val cnpjs = binding.etCNPJ.text.toString()
            val caixas = binding.etCaixa.text.toString().toFloat()
            val ars = binding.cbAr.isChecked

            Lista.lista.add(Supermercado(Lista.id, nomes, cnpjs, caixas, ars))
            Lista.id++
            Log.i("INSERIR-T", Lista.lista.toString())
            this.finish()
        }

        binding.btnPosto.setOnClickListener {
            val nomep = binding.etNome.text.toString()
            val cnpjp = binding.etCNPJ.text.toString()
            val caixap = binding.etCaixa.text.toString().toFloat()
            val capacidadep = binding.etCapacidade.text.toString().toFloat()

            Lista.lista.add(Posto(Lista.id, nomep, cnpjp, caixap, capacidadep))
            Lista.id++
            Log.i("INSERIR-T", Lista.lista.toString())
            this.finish()
        }

        binding.btnCinema.setOnClickListener {
            val nomec = binding.etNome.text.toString()
            val cnpjc = binding.etCNPJ.text.toString()
            val caixac = binding.etCaixa.text.toString().toFloat()
            val assentosc = binding.etAssentos.text.toString().toInt()

            Lista.lista.add(Cinema(Lista.id, nomec, cnpjc, caixac, assentosc))
            Lista.id++
            Log.i("INSERIR-T", Lista.lista.toString())
            this.finish()
        }


    }
}