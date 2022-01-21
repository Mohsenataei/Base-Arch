package io.github.maa96.basearch.di.module

import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module
interface UtilModule {

//    /**
//     * provide main implementation of [BaseConnectionManager] to check connection status
//     */
//    @Binds
//    @Singleton
//    fun bindConnectionManager(connectionManager: ConnectionManager): BaseConnectionManager
//
//    /**
//     * provide main implementation of [BaseDeviceUtil] to access device shared data, unique identifiers, etc
//     */
//    @Binds
//    @Singleton
//    fun bindDeviceUtil(deviceUtilImpl: DeviceUtilImpl): BaseDeviceUtil
//
//    /**
//     * Provide main implementation of [BaseResourceProvider] to access app raw resources
//     */
//    @Binds
//    fun bindResourceProvider(resourceProvider: ResourceProvider): BaseResourceProvider
//
//    /**
//     * Provide main implementation of [BaseFileProvider]
//     */
//    @Binds
//    fun bindFileProvider(fileProvider: FileProvider): BaseFileProvider
}
