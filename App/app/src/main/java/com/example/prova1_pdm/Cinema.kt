package com.example.prova1_pdm

import android.os.Parcelable
import java.io.Serializable

class Cinema (id : Int, nome : String, cnpj : String, caixa : Float, assentos : Int) : Estabelecimento(id, nome, cnpj, caixa) {
    var assentos : Int
    init {
        this.assentos = assentos
    }

    override fun toString(): String {
        return (this.id.toString() + " - Cinema - " + this.nome + " - Assentos " + this.assentos)
    }
}