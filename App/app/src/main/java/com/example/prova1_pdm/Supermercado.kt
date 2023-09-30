package com.example.prova1_pdm

import android.os.Parcelable
import java.io.Serializable

class Supermercado (id : Int, nome : String, cnpj : String, caixa : Float, ar : Boolean) : Estabelecimento (id, nome, cnpj, caixa) {
    var ar : Boolean
    init {
        this.ar = ar
    }

    override fun toString(): String {
        return (this.id.toString() + " - Supermercado - " + this.nome + " - Ar condicionado = " + this.ar)
    }
}