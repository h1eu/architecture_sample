package com.example.architecture_sample_app.data.di

import com.example.architecture_sample_app.data.local.room.dao.KPopIdolDao
import com.example.architecture_sample_app.data.repository.KPopIdolRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object DataModule {

    @Singleton
    @Provides
    fun provideKPopIdolRepository(
        kPopDao: KPopIdolDao
    ): KPopIdolRepository {
        return KPopIdolRepository (kPopDao)
    }
}