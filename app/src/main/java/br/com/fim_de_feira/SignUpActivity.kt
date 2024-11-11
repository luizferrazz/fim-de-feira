package br.com.fim_de_feira

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import br.com.fim_de_feira.databinding.ActivitySignupBinding
import br.com.fim_de_feira.entities.Costumer
import br.com.fim_de_feira.usecases.authSignUpActivity

class SignUpActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySignupBinding
    private val authViewModel: authSignUpActivity by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivitySignupBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setUpView()
    }

    private fun setUpView() {
        binding.btnRegisterUser.setOnClickListener {
            val firstName = binding.edtTextFirstName.text.toString()
            val lastName = binding.edtTextLastName.text.toString()
            val email = binding.edtTextEmail.text.toString()
            val idNumber = binding.edtTextIdNumber.text.toString()
            val phone = binding.edtTextPhone.text.toString()
            val password = binding.edtTextPassword.text.toString()
            val confirmPassword = binding.edtTextConfirmPassword.text.toString()

            val costumer = Costumer(
                firstName = firstName,
                lastName = lastName,
                email = email,
                idNumber = idNumber,
                phone = phone,
                password = password,
                confirmPassword = confirmPassword
            )

            authViewModel.createUser(costumer, onSuccess = {
                Toast.makeText(this, getString(R.string.on_success), Toast.LENGTH_SHORT).show()
            }, onFailure = {
                Toast.makeText(this, getString(R.string.on_failure), Toast.LENGTH_SHORT).show()
            })
        }
    }
}
