package io.github.maa96.basearch.util.device

interface BaseDeviceUtil {

    fun getAppVersion(): Int

    fun getAndroidVersion(): Int

//    fun getSimSerialNumber(): String?

    fun getUniqueId(): String
}