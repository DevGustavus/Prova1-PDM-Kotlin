package com.example.prova1_pdm

import android.os.Parcelable
import java.io.Serializable
import kotlinx.parcelize.Parcelize

open class Estabelecimento (val id : Int, var nome : String, var cnpj : String, var caixa : Float){

    override fun toString(): String {
        return ("Id - Estabelecimento - Nome - Caracteristica")
    }
}