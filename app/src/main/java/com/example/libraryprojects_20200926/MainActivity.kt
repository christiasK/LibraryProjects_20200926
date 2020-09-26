package com.example.libraryprojects_20200926

import android.content.Intent
import android.os.Bundle
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setup()
    }

    override fun setEvents() {
        profileImage.setOnClickListener {
            val intent = Intent(getContext(), PhotoViewActivity::class.java)
            startActivity(intent)
        }

        loadWebImageButton.setOnClickListener {
            Glide.with(getContext())
                .load("http://images.chosun.com/resizer/iazzNCmChQSYwZClCIpUKYVhG_Q=/616x0/smart/cloudfront-ap-northeast-1.images.arcpublishing.com/chosun/GPYL2KHPFZKX7G342LJBHWOFIE.jpg")
                .into(otherPerson)
        }
    }

    override fun setValues() {

    }
}