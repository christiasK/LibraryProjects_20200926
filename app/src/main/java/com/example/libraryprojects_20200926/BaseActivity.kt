package com.example.libraryprojects_20200926

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity() {

    protected fun setup() {
        setEvents()
        setValues()
    }

    fun getContext() : Context {
        return this
    }

    abstract fun setEvents()
    abstract fun setValues()
}