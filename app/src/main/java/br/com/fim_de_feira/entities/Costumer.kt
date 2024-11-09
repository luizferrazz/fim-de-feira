package br.com.fim_de_feira.entities

data class Costumer (
    var id : Int = 0,
    var firstName : String,
    var lastName : String,
    var email : String,
    var cpf : String,
    var phone : String,
    var password : String,
    var confirmPassword: String
)