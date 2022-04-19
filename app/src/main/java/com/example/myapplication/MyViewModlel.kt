package com.example.myapplication

import android.os.CountDownTimer
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewModlel : ViewModel() {

    private lateinit var timer: CountDownTimer

    val data = MutableLiveData<Int>()


    fun startTimer() {
        timer = object : CountDownTimer(10000, 1000) {

            override fun onFinish() {

            }

            override fun onTick(p0: Long) {
                val timeLift = p0 / 1000
                data.value = timeLift.toInt()
            }


        }
    }
}