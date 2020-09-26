package com.example.libraryprojects_20200926.fragments

import com.example.libraryprojects_20200926.MainActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [FirstFragment::class, SecondFragment::class])
interface FragmentComponent {
    fun inject(mainActivity: MainActivity)
}