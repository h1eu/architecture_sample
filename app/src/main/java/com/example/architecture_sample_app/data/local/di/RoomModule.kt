package com.example.architecture_sample_app.data.local.di

import android.content.Context
import androidx.room.Room
import com.example.architecture_sample_app.data.local.room.KPopIdolsDatabase
import com.example.architecture_sample_app.data.local.room.dao.KPopIdolDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object RoomModule {

    @Singleton
    @Provides
    fun provideKPopIdolsDatabase(@ApplicationContext context: Context): KPopIdolsDatabase {
        return Room.databaseBuilder(
            context,
            KPopIdolsDatabase::class.java,
            KPopIdolsDatabase.DB_NAME
        ).fallbackToDestructiveMigration().build()
    }

    @Singleton
    @Provides
    fun provideKPopIdolDao(kPopIdolsDatabase: KPopIdolsDatabase): KPopIdolDao {
        return kPopIdolsDatabase.kPopIdolDao()
    }
}