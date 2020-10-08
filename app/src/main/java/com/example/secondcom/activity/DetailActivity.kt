package com.example.secondcom.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.secondcom.R
import kotlinx.android.synthetic.main.activity_detail.*

@Suppress("RECEIVER_NULLABILITY_MISMATCH_BASED_ON_JAVA_ANNOTATIONS")
class DetailActivity : AppCompatActivity() {

    companion object {
        const val cont_TitleNews = "cont_TitleNews"
        const val cont_PhotoNews = "cont_PhotoNews"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        txt_TitleNews.text = intent.getStringExtra(cont_TitleNews)
        img_toolbar.setImageResource(intent.getStringExtra(cont_PhotoNews).toInt())

        btn_Back.setOnClickListener {
            val intentMain = Intent(
                this@DetailActivity,
                MainActivity::class.java
            )
            startActivity(intentMain)
            finish()
        }
    }
}