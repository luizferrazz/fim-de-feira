package br.com.fim_de_feira

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import br.com.fim_de_feira.databinding.ActivityLoginBinding
import br.com.fim_de_feira.databinding.ActivitySignupBinding
import br.com.fim_de_feira.entities.Costumer
import br.com.fim_de_feira.usecases.authSignUpActivity


class SignUpActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySignupBinding;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivitySignupBinding.inflate(layoutInflater)
        setContentView(binding.root)

        fun setUpView(){
            binding.btnRegisterUser.setOnClickListener {
                val firstName = binding.edtTextFirstName.text.toString()
                val lastName = binding.edtTextLastName.text.toString()
                val email = binding.edtTextEmail.text.toString()
                val idNumber = binding.edtTextIdNumber.text.toString()
                val phone = binding.edtTextPhone.text.toString()
                val password = binding.edtTextPassword.text.toString()
                val confirmPassword = binding.edtTextConfirmPassword.text.toString()

                var signup = false
            }

            val costumer : Costumer
            authSignUpActivity().createUser(costumer)
        }
    }
}