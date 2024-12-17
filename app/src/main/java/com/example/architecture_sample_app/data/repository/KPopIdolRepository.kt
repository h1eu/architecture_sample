package com.example.architecture_sample_app.data.repository

import com.example.architecture_sample_app.data.local.room.dao.KPopIdolDao
import com.example.architecture_sample_app.data.local.room.entity.KPopIdolEntity
import javax.inject.Inject

class KPopIdolRepository @Inject constructor(
    private val kPopDao: KPopIdolDao
) {
    suspend fun add(idol: KPopIdolEntity){
        kPopDao.insertKPopIdol(idol)
    }
}