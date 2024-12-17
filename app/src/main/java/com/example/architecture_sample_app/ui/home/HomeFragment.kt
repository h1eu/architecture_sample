package com.example.architecture_sample_app.ui.home

import android.view.View
import androidx.fragment.app.viewModels
import com.example.architecture_sample_app.base.BaseFragment
import com.example.architecture_sample_app.databinding.FragmentHomeBinding
import com.example.architecture_sample_app.util.showDialogAddIdol

class HomeFragment : BaseFragment<FragmentHomeBinding>(FragmentHomeBinding::inflate) {
    private val homeViewModel: HomeViewModel by viewModels()

    override fun init(view: View) {
        initListener()
    }

    override fun onSubscribeObserver(view: View) {}

    private fun initListener() {
        binding.apply {
            fabAdd.setOnClickListener {
                context?.showDialogAddIdol{ kPopIdolEntity ->
                    homeViewModel.addKPopIdol(kPopIdolEntity)
                }
            }
        }
    }
}