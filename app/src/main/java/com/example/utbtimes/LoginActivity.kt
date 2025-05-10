package com.example.utbtimes

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {

    private lateinit var formEmail: EditText
    private lateinit var formPassword: EditText
    private lateinit var btnLogin: Button
    private lateinit var txtRegister: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_activity)

        formEmail = findViewById(R.id.formEmail)
        formPassword = findViewById(R.id.formPassword)
        btnLogin = findViewById(R.id.btnLogin)
        txtRegister = findViewById(R.id.txtRegister)

        btnLogin.setOnClickListener {
            val email = formEmail.text.toString()
            val password = formPassword.text.toString()

            if (email == "pressutb@mail.com" && password == "press1234") {

                val intent = Intent(this, NewsPortalDashboard::class.java)
                startActivity(intent)
                finish()
            } else {
                Toast.makeText(this, "Email atau password salah", Toast.LENGTH_SHORT).show()
            }
        }

        txtRegister.setOnClickListener {
            // Intent untuk membuka RegisterActivity
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
    }
}
