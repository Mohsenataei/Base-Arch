package io.github.maa96.basearch.util.device

import com.mohsen.architecture.BuildConfig
import io.github.maa96.data.source.preference.AppPreferencesHelper
import java.util.UUID
import javax.inject.Inject

class DeviceUtilImpl @Inject constructor(
    private val appPreferencesHelper: AppPreferencesHelper
) : BaseDeviceUtil {

    override fun getAndroidVersion(): Int {
        return android.os.Build.VERSION.SDK_INT
    }

    override fun getUniqueId(): String {
        if (appPreferencesHelper.uniqueId.isEmpty()) {
            appPreferencesHelper.uniqueId = UUID.randomUUID().toString()
        }

        return appPreferencesHelper.uniqueId
    }

    override fun getAppVersion(): Int {
        return BuildConfig.VERSION_CODE
    }
}
