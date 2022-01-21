package io.github.maa96.basearch.di.module

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import io.github.maa96.basearch.util.connectivity.BaseConnectionManager
import io.github.maa96.basearch.util.connectivity.ConnectionManager
import io.github.maa96.basearch.util.device.BaseDeviceUtil
import io.github.maa96.basearch.util.device.DeviceUtilImpl
import io.github.maa96.basearch.util.providers.BaseResourceProvider
import io.github.maa96.basearch.util.providers.ResourceProvider
import io.github.maa96.data.source.local.file.BaseFileProvider
import io.github.maa96.data.source.local.file.FileProvider
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
interface UtilModule {

    /**
     * provide main implementation of [BaseConnectionManager] to check connection status
     */
    @Binds
    @Singleton
    fun bindConnectionManager(connectionManager: ConnectionManager): BaseConnectionManager

    /**
     * provide main implementation of [BaseDeviceUtil] to access device shared data, unique identifiers, etc
     */
    @Binds
    @Singleton
    fun bindDeviceUtil(deviceUtilImpl: DeviceUtilImpl): BaseDeviceUtil

    /**
     * Provide main implementation of [BaseResourceProvider] to access app raw resources
     */
    @Binds
    fun bindResourceProvider(resourceProvider: ResourceProvider): BaseResourceProvider

    /**
     * Provide main implementation of [BaseFileProvider]
     */
    @Binds
    fun bindFileProvider(fileProvider: FileProvider): BaseFileProvider
}
