package com.example.architecture_sample_app.data.local.room.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "KPopIdolEntity")
data class KPopIdolEntity(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo("id")
    var id: Int = 0,

    @ColumnInfo("stageName")
    var stageName: String = "",

    @ColumnInfo("company")
    var company: String = "",

    @ColumnInfo("groups")
    var groups: String = "",

    @ColumnInfo("role")
    var role: String = ""
)