package br.com.fim_de_feira.entities

data class Address (
    var street : String,
    var neighborhood : String,
    var number : Int,
    var city : String,
    var state : String,
    var cep : String,
)