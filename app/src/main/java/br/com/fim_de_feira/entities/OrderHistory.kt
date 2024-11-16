package br.com.fim_de_feira.entities

data class OrderHistory(
    val supermarket: OrderHistory,
    val date: String,
    val details: String
)