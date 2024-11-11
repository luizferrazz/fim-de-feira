package br.com.fim_de_feira.usecases

import androidx.lifecycle.ViewModel
import br.com.fim_de_feira.entities.Costumer
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore

class authSignUpActivity : ViewModel() {

    private val auth = FirebaseAuth.getInstance()
    private val firestore = FirebaseFirestore.getInstance()

    fun createUser(
        costumer: Costumer,
        onSuccess: () -> Unit,
        onFailure: () -> Unit
    ) {
        // Validação de campos nulos
        if (costumer.firstName.isEmpty() || costumer.lastName.isEmpty() ||
            costumer.email.isEmpty() || costumer.idNumber.isEmpty() ||
            costumer.phone.isEmpty() || costumer.password.isEmpty() ||
            costumer.confirmPassword.isEmpty()
        ) {
            onFailure.invoke()
            return
        }

        // Validação de email com regex
        val emailRegex = Regex("[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+")
        if (!emailRegex.matches(costumer.email)) {
            onFailure.invoke()
            return
        }

        // Validação de telefone com regex
        val phoneRegex = Regex("^\\s*(\\d{2})\\s*(\\d{4,5}|\\d{0})\\s*(\\d{4}|\\d{0})\\s*$")
        if (!phoneRegex.matches(costumer.phone)) {
            onFailure.invoke()
            return
        }

        if (costumer.password != costumer.confirmPassword) {
            onFailure.invoke()
            return
        }

        if (costumer.password.length < 6 || costumer.idNumber.length != 11 ||
            costumer.phone.length != 11) {
            onFailure.invoke()
            return
        }

        auth.createUserWithEmailAndPassword(costumer.email, costumer.password)
            .addOnSuccessListener { authResult ->

                val userId = authResult.user?.uid ?: ""

                val userMap = hashMapOf(
                    "firstName" to costumer.firstName,
                    "lastName" to costumer.lastName,
                    "email" to costumer.email,
                    "idNumber" to costumer.idNumber,
                    "phone" to costumer.phone
                )

                firestore.collection("fim-de-feira")
                    .document(userId)
                    .set(userMap)

                onSuccess()
            }
            .addOnFailureListener {
                onFailure()
            }
    }

}