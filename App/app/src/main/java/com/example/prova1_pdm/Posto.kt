package com.example.prova1_pdm

import android.os.Parcelable
import java.io.Serializable

class Posto (id : Int, nome : String, cnpj : String, caixa : Float, capacidade : Float) : Estabelecimento(id ,nome, cnpj, caixa) {
    var capacidade : Float
    init {
        this.capacidade = capacidade
    }

    override fun toString(): String {
        return (this.id.toString() + " - Posto - " + this.nome + " - Capacidade = " + this.capacidade)
    }
}