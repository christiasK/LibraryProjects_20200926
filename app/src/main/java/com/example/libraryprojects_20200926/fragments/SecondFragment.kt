package com.example.libraryprojects_20200926.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.libraryprojects_20200926.R
import dagger.Module
import kotlinx.android.synthetic.main.fragment_second.*

@Module
class SecondFragment : CustomFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        showToast.setOnClickListener {
            val toast = Toast.makeText(context, "내용", Toast.LENGTH_SHORT)
            toast.show()
        }
    }

    override fun getName(): String {
        return "second"
    }

    override fun supports(position: Int): Boolean {
        return position == 1
    }
}