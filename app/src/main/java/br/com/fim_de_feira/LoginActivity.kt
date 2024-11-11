package br.com.fim_de_feira

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import br.com.fim_de_feira.databinding.ActivityLoginBinding
import br.com.fim_de_feira.usecases.authLoginActivity

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding;


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLogin.setOnClickListener{
            val email = binding.edtTextEmail.text.toString()
            val password = binding.edtTextPassword.text.toString()

            authLoginActivity().login(email, password, onSuccess = {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }, onFailure = {
                Toast.makeText(this, getString(R.string.login_failure), Toast.LENGTH_SHORT).show()
            })
        }

        binding.btnSignup.setOnClickListener {
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }
    }
}