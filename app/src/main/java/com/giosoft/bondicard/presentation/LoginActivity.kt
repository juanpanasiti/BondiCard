package com.giosoft.bondicard.presentation

import android.os.Bundle
import com.giosoft.bondicard.R
import com.giosoft.bondicard.presentation.baseactivity.FullScreenBaseActivity
import com.giosoft.bondicard.presentation.helpers.FontManager
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : FullScreenBaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }//onCreate()

    override fun getLayout(): Int {
        return R.layout.activity_login
    }//getLayout()
}
