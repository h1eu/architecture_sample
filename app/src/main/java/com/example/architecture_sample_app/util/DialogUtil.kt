package com.example.architecture_sample_app.util

import android.annotation.SuppressLint
import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.view.Gravity
import android.view.LayoutInflater
import android.view.Window
import android.view.WindowManager
import androidx.core.widget.doAfterTextChanged
import com.example.architecture_sample_app.R
import com.example.architecture_sample_app.data.local.room.entity.KPopIdolEntity
import com.example.architecture_sample_app.databinding.DialogAddBinding

@SuppressLint("InflateParams")
fun Context.showDialogAddIdol(
    onAddClick:(KPopIdolEntity) -> Unit
) {
    val dialog = Dialog(this,R.style.dialog_anim)
    val view = LayoutInflater.from(this).inflate(R.layout.dialog_add, null)
    dialog.setContentView(view)
    dialog.window?.apply {
        setGravity(Gravity.BOTTOM)
        setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        setLayout(
            WindowManager.LayoutParams.MATCH_PARENT,
            WindowManager.LayoutParams.WRAP_CONTENT
        )
    }

    if (!dialog.isShowing){
        dialog.show()
    }

    val binding = DialogAddBinding.bind(view)
    binding.apply {
        val stageName = edtStageName.saveTextOnAfterTextChange()
        val company = edtCompany.saveTextOnAfterTextChange()
        val group = edtGroup.saveTextOnAfterTextChange()
        val role = edtRole.saveTextOnAfterTextChange()


        btnAdd.setOnClickListener{
            onAddClick.invoke(
                KPopIdolEntity(
                    stageName = stageName,
                    company = company,
                    group = group,
                    role = role
                )
            )
            dialog.dismiss()
        }
    }
}