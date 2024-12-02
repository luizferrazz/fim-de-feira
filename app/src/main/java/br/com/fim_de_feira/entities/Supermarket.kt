package br.com.fim_de_feira.entities

data class Supermarket(
    var name: String,
    var address: Address, //abstract
    var serviceOrders: List<ServiceOrder>,//abstract
    var products : List<Product>,//abstract
    var logoLink: String,
    var status: Boolean,
    )