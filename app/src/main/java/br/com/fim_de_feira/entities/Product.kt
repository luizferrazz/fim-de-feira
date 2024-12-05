package br.com.fim_de_feira.entities

data class Product(
    var name: String = "",
    var price: Double = 0.0,
    var quantity: String = "",
    var category: String = "",
    var description: String = "",
    var weight: String = "",
    var brand: String = "",
    var consumeDays: Int = 0
)
