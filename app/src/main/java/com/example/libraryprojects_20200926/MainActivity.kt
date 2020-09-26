package com.example.libraryprojects_20200926

import android.Manifest
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Toast
import com.bumptech.glide.Glide
import com.gun0912.tedpermission.PermissionListener
import com.gun0912.tedpermission.TedPermission
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

        callPhoneNumber.setOnClickListener {

            val pl = object : PermissionListener {
                override fun onPermissionGranted() {
                    val phoneNumber = phoneNumber.text
                    val uri = Uri.parse("tel:$phoneNumber")
                    val intent = Intent(Intent.ACTION_CALL, uri)

                    startActivity(intent)
                }

                override fun onPermissionDenied(deniedPermissions: MutableList<String>?) {
                    Toast.makeText(getContext(), "Permission Denied\n${deniedPermissions.toString()}", Toast.LENGTH_SHORT).show()
                }
            }

            TedPermission.with(this)
                .setPermissionListener(pl)
                .setDeniedMessage("If you reject permission,you can not use this service\n\nPlease turn on permissions at [Setting] > [Permission]")
                .setPermissions(Manifest.permission.CALL_PHONE)
                .check()
        }
    }

    override fun setValues() {

    }
}