package br.com.fim_de_feira.entities

data class Product (
    var name : String,
    var price : Double,
    var quantity : Int,
    var category : String,
    var description: String,
    var weight : String,
    var brand : String,
    var consumeDays : Int,

)