package com.example.prova1_pdm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.isInvisible
import com.example.prova1_pdm.databinding.ActivityAlterarBinding
import com.example.prova1_pdm.databinding.ActivityMostrarBinding

class AlterarActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAlterarBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAlterarBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val id = intent.getIntExtra("id", 0)

        for (i in Lista.lista){
            if(id == i.id){
                binding.etNome2.setText(i.nome)
                binding.etCNPJ2.setText(i.cnpj)
                binding.etCaixa2.setText(i.caixa.toString())
                when {
                    i is Supermercado -> {
                        if(i.ar){
                            binding.cbAr2.isChecked = true
                        }
                        binding.etCapacidade2.isInvisible = true
                        binding.btnPosto2.isInvisible = true
                        binding.etAssentos2.isInvisible = true
                        binding.btnCinema2.isInvisible = true
                    }
                    i is Posto -> {
                        binding.etCapacidade2.setText(i.capacidade.toString())

                        binding.cbAr2.isInvisible = true
                        binding.btnSupermercado2.isInvisible = true
                        binding.etAssentos2.isInvisible = true
                        binding.btnCinema2.isInvisible = true
                    }
                    i is Cinema -> {
                        binding.etAssentos2.setText(i.assentos.toString())

                        binding.cbAr2.isInvisible = true
                        binding.btnSupermercado2.isInvisible = true
                        binding.etCapacidade2.isInvisible = true
                        binding.btnPosto2.isInvisible = true
                    }
                }
            }
        }

        binding.btnSupermercado2.setOnClickListener{
            val nome = binding.etNome2.text.toString()
            val cnpj = binding.etCNPJ2.text.toString()
            val caixa = binding.etCaixa2.text.toString().toFloat()
            val ar = binding.cbAr2.isChecked

            for (i in Lista.lista){
                if(id == i.id){
                    if(i is Supermercado){
                        i.nome = nome
                        i.cnpj = cnpj
                        i.caixa = caixa
                        i.ar = ar
                        break
                    }
                }
            }
            Intent().apply {
                putExtra("ok", true)
                setResult(RESULT_OK, this)
            }
            this.finish()
        }
        binding.btnPosto2.setOnClickListener{
            val nome = binding.etNome2.text.toString()
            val cnpj = binding.etCNPJ2.text.toString()
            val caixa = binding.etCaixa2.text.toString().toFloat()
            val capacidade = binding.etCapacidade2.text.toString().toFloat()

            for (i in Lista.lista){
                if(id == i.id){
                    if(i is Posto){
                        i.nome = nome
                        i.cnpj = cnpj
                        i.caixa = caixa
                        i.capacidade = capacidade
                        break
                    }
                }
            }
            Intent().apply {
                putExtra("ok", true)
                setResult(RESULT_OK, this)
            }
            this.finish()
        }
        binding.btnCinema2.setOnClickListener{
            val nome = binding.etNome2.text.toString()
            val cnpj = binding.etCNPJ2.text.toString()
            val caixa = binding.etCaixa2.text.toString().toFloat()
            val assentos = binding.etAssentos2.text.toString().toInt()

            for (i in Lista.lista){
                if(id == i.id){
                    if(i is Cinema){
                        i.nome = nome
                        i.cnpj = cnpj
                        i.caixa = caixa
                        i.assentos = assentos
                        break
                    }
                }
            }

            this.finish()
        }
    }

}