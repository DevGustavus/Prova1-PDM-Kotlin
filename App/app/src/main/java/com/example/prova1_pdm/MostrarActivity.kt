package com.example.prova1_pdm

import android.R
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.activity.result.ActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import com.example.prova1_pdm.databinding.ActivityInserirBinding
import com.example.prova1_pdm.databinding.ActivityMostrarBinding

class MostrarActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMostrarBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMostrarBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val adp = ArrayAdapter(this, R.layout.simple_list_item_1, Lista.lista)
        binding.lvLugares.adapter = adp

        Log.i("MOSTRARTV", Lista.lista.toString())

        binding.btnRemover.setOnClickListener {
            val id = binding.etRemover.text.toString().toInt()


            var b: Boolean = false
            for (i in Lista.lista){
                if (id == i.id){
                    b = true
                    val toast = Toast.makeText(this, i.nome + " foi removido com sucesso!", Toast.LENGTH_SHORT)
                    Lista.lista.remove(i)
                    toast.show()
                    Log.i("TESTEE", Lista.lista.toString())
                    break
                }
            }
            if(!b){
                val toast = Toast.makeText(this, "Id inválido!", Toast.LENGTH_SHORT)
                toast.show()
            }
            val adp2 = ArrayAdapter(this, R.layout.simple_list_item_1, Lista.lista)
            binding.lvLugares.adapter = adp2

            binding.etRemover.text.clear()
        }

        binding.btnAlterar.setOnClickListener {

            val id = binding.etAlterar.text.toString().toInt()

            var exist = false
            for (i in Lista.lista){
                if(id == i.id){
                    exist = true
                    break
                }
            }

            if(exist){
                val intent = Intent(this, AlterarActivity::class.java)
                intent.putExtra("id", id)
                startActivity(intent)

                this.finish()
            }else{
                Toast.makeText(this, "Id inválido!", Toast.LENGTH_SHORT).show()
            }

            binding.etAlterar.text.clear()
        }

    }

}