package br.com.fim_de_feira.entities

abstract class ServiceOrder (
    var id: Int,
    var costumer: Costumer,
    var supermarket: Supermarket,
    var products: List<Product>,
    var price: Double
)