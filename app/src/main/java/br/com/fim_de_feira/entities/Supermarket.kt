package br.com.fim_de_feira.entities

data class Supermarket (
    var name: String,
    var address: Address,
    var products: List<Product>,
    var serviceOrders: List<ServiceOrder>,
    var logoLink: String,
    var status : Boolean
    )