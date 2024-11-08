package br.com.fim_de_feira.entities

data class Supermarket (
    var id: Int,
    var name: String,
    var address: Address,
    var products: List<Product> = emptyList(),
    var serviceOrders: List<ServiceOrder> = emptyList(),
    var logoLink: String = "",
    var status : Boolean = false
    )