package com.example.antithieft

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_log_in.*

var Uname:String = ""
var PassW:String = ""

class LogInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in)

        ButLogin.setOnClickListener(){
            Uname = textUsername.text.toString()
            PassW = textPassword.text.toString()

            if (Uname.contains("admin") && PassW.contains("admin")){
                intent = Intent(this, SelectDeviceActivity::class.java)
                startActivity(intent)
            } else {
                Toast.makeText(applicationContext, "wrong Username or Password",Toast.LENGTH_LONG).show()
            }
        }
    }
}