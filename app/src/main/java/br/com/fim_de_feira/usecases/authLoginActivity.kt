package br.com.fim_de_feira.usecases

import androidx.lifecycle.ViewModel
import com.google.firebase.auth.FirebaseAuth

class authLoginActivity: ViewModel() {

    private val firebaseAuth = FirebaseAuth.getInstance()
    private val auth = FirebaseAuth.getInstance()

    fun login (
        email: String,
        password: String,
        onSuccess: () -> Unit,
        onFailure: () -> Unit
    ){
        if(email.isEmpty() || password.isEmpty()){
            onFailure.invoke()
        }else {
            auth.signInWithEmailAndPassword(email, password)
                .addOnSuccessListener {
                    onSuccess()
                }
        }
    }
}