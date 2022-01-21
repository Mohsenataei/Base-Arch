package io.github.maa96.data.repository

import arrow.core.Either
import io.github.maa96.data.mapper.ErrorMapper
import io.github.maa96.data.model.Error
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

abstract class BaseRepository(private val errorMapper: ErrorMapper) {
    protected suspend fun <T : Any> safeApiCall(call: suspend () -> T): Either<Error, T> {
        return withContext(Dispatchers.IO) {
            getResult(call)
        }
    }

    private suspend fun <T : Any> getResult(call: suspend () -> T):Either<Error, T> {
        return try {
            Either.right(call.invoke())
        }catch (t: Throwable){
            Either.left(errorMapper.getError(t))
        }
    }
}