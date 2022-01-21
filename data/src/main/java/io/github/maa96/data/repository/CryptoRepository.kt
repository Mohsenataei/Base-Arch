package io.github.maa96.data.repository

import arrow.core.Either
import io.github.maa96.data.di.qualifier.Concrete
import io.github.maa96.data.mapper.ErrorMapper
import io.github.maa96.data.model.Error
import io.github.maa96.data.model.crypto.CryptoCurrency
import io.github.maa96.data.source.remote.DataSource
import io.github.maa96.data.source.remote.StubDataSource
import javax.inject.Inject

class CryptoRepository @Inject constructor(
    errorMapper: ErrorMapper,
    @Concrete private val dataSource: DataSource
) : BaseRepository(errorMapper) {
    suspend fun getLatestUpdates(
        start: Int = 1,
        limit: Int = 20,
        convertTo: String = "USD"
    ): Either<Error, List<CryptoCurrency>> {
        return safeApiCall { dataSource.getLatestUpdates(start, limit, convertTo) }.map { it.data }
    }
}
