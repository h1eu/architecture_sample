package com.example.architecture_sample_app.base

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentFactory
import com.example.architecture_sample_app.ui.home.HomeFragment
import com.example.architecture_sample_app.util.SharedPreferenceUtil
import javax.inject.Inject

class MainFragmentFactory @Inject constructor(
    private val sharedPreUtil: SharedPreferenceUtil
) : FragmentFactory() {
    override fun instantiate(classLoader: ClassLoader, className: String): Fragment {
        return when(className){
            HomeFragment::class.java.name -> {
                HomeFragment()
            }
            else -> {
                super.instantiate(classLoader, className)
            }
        }
    }
}