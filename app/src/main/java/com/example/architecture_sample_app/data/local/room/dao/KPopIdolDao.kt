package com.example.architecture_sample_app.data.local.room.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.example.architecture_sample_app.data.local.room.entity.KPopIdolEntity

@Dao
interface KPopIdolDao {
    @Query("SELECT * FROM KPopIdolEntity")
    suspend fun getAll(): List<KPopIdolEntity>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertKPopIdol(kPopIdolEntity: KPopIdolEntity)

    @Delete
    suspend fun deleteKPopIdol(kPopIdolEntity: KPopIdolEntity)

    @Update
    suspend fun updateKPopIdol(kPopIdolEntity: KPopIdolEntity)

}