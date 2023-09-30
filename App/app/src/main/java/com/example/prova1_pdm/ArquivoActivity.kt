package com.example.prova1_pdm

import android.content.ContentValues
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.prova1_pdm.databinding.ActivityArquivoBinding
import java.io.File
import java.io.FileWriter
import java.io.IOException

class ArquivoActivity : AppCompatActivity() {

    private lateinit var binding: ActivityArquivoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityArquivoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnCriarA.setOnClickListener {
            val arquivo = File(binding.root.context.filesDir, "estabelecimentos.txt")

            try {
                arquivo.createNewFile()
                val writer = FileWriter(arquivo)
                for (i in Lista.lista) {
                    writer.write(i.toString() + "\n")
                }
                writer.close()

                Toast.makeText(binding.root.context, "Arquivo criado com sucesso", Toast.LENGTH_SHORT).show()
            } catch (e: IOException) {
                Toast.makeText(binding.root.context, "Falha ao criar arquivo", Toast.LENGTH_SHORT).show()
                e.printStackTrace()
            }
        }

        binding.btnMostrarA.setOnClickListener {
            val arquivo = File(binding.root.context.filesDir, "estabelecimentos.txt")

            val reader = arquivo.bufferedReader()
            val leitura = reader.readLines()

            for (line in leitura) {
                println(line)
            }

            Toast.makeText(binding.root.context, "Arquivo exibido no Logcat", Toast.LENGTH_SHORT).show()
        }

    }
}