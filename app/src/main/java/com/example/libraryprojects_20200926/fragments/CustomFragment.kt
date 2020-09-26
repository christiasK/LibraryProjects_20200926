package com.example.libraryprojects_20200926.fragments

import androidx.fragment.app.Fragment
import dagger.Provides

abstract class CustomFragment : Fragment() {

    @Provides
    fun customFragment(): Fragment {
        return this
    }

    abstract fun getName(): String
    abstract fun supports(position: Int): Boolean

}