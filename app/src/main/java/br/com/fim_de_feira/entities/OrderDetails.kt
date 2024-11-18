package br.com.fim_de_feira.entities

data class OrderDetails (
    val name: String,
    val date: String,
    val numberOrder: String,
    val status: String,
    val products: String,
    val typeProduct: String,
    val total: String
)