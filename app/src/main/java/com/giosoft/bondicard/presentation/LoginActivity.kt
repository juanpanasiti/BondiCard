package com.giosoft.bondicard.presentation

import android.os.Bundle
import com.giosoft.bondicard.R
import com.giosoft.bondicard.presentation.baseactivity.FullScreenBaseActivity

class LoginActivity : FullScreenBaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }//onCreate()

    override fun getLayout(): Int {
        return R.layout.activity_login
    }//getLayout()
}
