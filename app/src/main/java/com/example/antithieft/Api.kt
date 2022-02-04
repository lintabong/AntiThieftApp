package com.example.antithieft

import android.telecom.Call
import retrofit2.http.GET

interface Api {
    @GET("cameraStat")
    fun getcameraStat(): Call<ArrayList<CameraResponse>>
}