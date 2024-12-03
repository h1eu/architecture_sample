package com.example.architecture_sample_app.data.repository

import com.example.architecture_sample_app.base.DataState
import com.example.architecture_sample_app.data.local.room.dao.KPopIdolDao
import com.example.architecture_sample_app.data.local.room.model.KPopIdolEntity
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import java.lang.Exception

class ExampleRepository(
    private val exampleDao: KPopIdolDao
) {
    suspend fun getAllExample(): Flow<DataState<List<KPopIdolEntity>>> = flow {
        emit(DataState.Loading)
        try {
            emit(DataState.Success(exampleDao.getAll()))
        }
        catch (e: Exception){
            emit(DataState.Error(e))
        }
    }
}