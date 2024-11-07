package br.com.fim_de_feira.entities

data class Product (
    var id : Int = 0,
    var name : String = "",
    var price : Double = 0.0,
    var quantity : Int = 0,
    var category : String = "",
    var description: String = "",
    var weight : Double = 0.0,
    var brand : String = "",
    var consumeDays : Int = 0,
)