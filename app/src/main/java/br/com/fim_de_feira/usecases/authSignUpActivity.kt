package br.com.fim_de_feira.usecases

import androidx.lifecycle.ViewModel
import br.com.fim_de_feira.entities.Costumer
import com.google.firebase.auth.FirebaseAuth

class authSignUpActivity : ViewModel() {

    private val auth = FirebaseAuth.getInstance()

    fun createUser(
        costumer: Costumer,
        onSuccess: () -> Unit,
        onFailure: () -> Unit
    ) {
        // 1. Validação de campos nulos
        if (costumer.firstName.isEmpty() || costumer.lastName.isEmpty() ||
            costumer.email.isEmpty() || costumer.cpf.isEmpty() ||
            costumer.phone.isEmpty() || costumer.password.isEmpty() ||
            costumer.confirmPassword.isEmpty()
        ) {
            onFailure.invoke()
            return
        }

        // 2. Validação de email com regex
        val emailRegex = Regex("[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+")
        if (!emailRegex.matches(costumer.email)) {
            onFailure.invoke()
            return
        }// 3. Validação de telefone com regex
        val phoneRegex = Regex("^\\s*(\\d{2})\\s*(\\d{4,5}|\\d{0})\\s*(\\d{4}|\\d{0})\\s*$")
        if (!phoneRegex.matches(costumer.phone)) {
            onFailure.invoke()
            return
        }

        // Se todas as validações passarem, prossiga com a criação do usuário
        auth.createUserWithEmailAndPassword(costumer.email, costumer.password)
            .addOnSuccessListener {
                onSuccess()
            }
            .addOnFailureListener {
                onFailure()
            }
    }

}