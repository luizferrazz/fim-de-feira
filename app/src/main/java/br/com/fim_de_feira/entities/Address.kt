package br.com.fim_de_feira.entities

data class Address (
    var id : Int = 0,
    var street : String = "",
    var neighborhood : String = "",
    var number : Int = 0,
    var city : String = "Recife",
    var state : String = "Pernambuco",
    var cep : String = "",
)