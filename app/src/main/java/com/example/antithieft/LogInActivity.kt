package com.example.antithieft

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.telecom.Call
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_log_in.*
import retrofit2.Callback
import retrofit2.Response

var Uname:String = ""
var PassW:String = ""

class LogInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in)




        fun login(){
            val request = UserRequest()
            request.username = textUsername.text.toString().trim()
            request.password = textPassword.text.toString().trim()

            val retro = Retro().getRetroClientInstance().create(UserApi::class.java)
            retro.login(request).enqueue(object : Callback<UserResponse>{
                override fun onResponse(
                    call: retrofit2.Call<UserResponse>,
                    response: Response<UserResponse>
                ) {
                    TODO("Not yet implemented")
                }

                override fun onFailure(call: retrofit2.Call<UserResponse>, t: Throwable) {
                    TODO("Not yet implemented")
                }

            })
        }

        fun initAction(){
            ButLogin.setOnClickListener {
                login()
            }
        }

        initAction()


    }
}