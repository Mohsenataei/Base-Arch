package io.github.maa96.basearch.util.device

import io.github.maa96.data.source.preference.AppPreferencesHelper
import java.util.*
import javax.inject.Inject

class DeviceUtil @Inject constructor(
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
        return 0
//        return BuildConfig.VERSION_CODE
    }
}
