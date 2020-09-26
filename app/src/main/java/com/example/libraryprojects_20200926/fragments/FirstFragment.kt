package com.example.libraryprojects_20200926.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.libraryprojects_20200926.R
import dagger.Module
import kotlinx.android.synthetic.main.fragment_first.*

@Module
class FirstFragment : CustomFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        changeTextBtn.setOnClickListener {
            firstText.text = "텍스트 변경됨"
        }
    }

    override fun getName(): String {
        return "first"
    }

    override fun supports(position: Int): Boolean {
        return position == 0
    }
}