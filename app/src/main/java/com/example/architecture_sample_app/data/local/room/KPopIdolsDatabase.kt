package com.example.architecture_sample_app.data.local.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.architecture_sample_app.data.local.room.dao.KPopIdolDao
import com.example.architecture_sample_app.data.local.room.entity.KPopIdolEntity

@Database(
    entities = [
        KPopIdolEntity::class
    ], version = 1
)
abstract class KPopIdolsDatabase : RoomDatabase() {
    abstract fun kPopIdolDao(): KPopIdolDao

    companion object{
        const val DB_NAME = "K Pop idols db"
    }
}