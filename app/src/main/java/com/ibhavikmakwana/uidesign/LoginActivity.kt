package com.ibhavikmakwana.uidesign

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    /**
     * Call this method to launch the activity.
     */
    companion object {
        fun launchActivity(context: Context) {
            val intent = Intent(context, LoginActivity::class.java)
            context.startActivity(intent)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        cv_top_left.circleColor = ContextCompat.getColor(this, R.color.colorCircleOne)
        cv_bottom_left.circleColor = ContextCompat.getColor(this, R.color.colorCircleTwo)
        cv_bottom_right.circleColor = ContextCompat.getColor(this, R.color.colorCircleThree)
        cv_top_right.circleColor = ContextCompat.getColor(this, R.color.colorCircleOne)

        btn_register.setOnClickListener {
            RegisterActivity.launchActivity(this)
        }
        tv_forgot_password.setOnClickListener {
            ForgotPasswordActivity.launchActivity(this)
        }
        btn_login.setOnClickListener {
            MainActivity.launchActivity(this)
        }
    }
}
