plugins {
    id("com.android.library")
    id("kotlin-android")
    id("kotlin-kapt")
}

android {
    compileSdkVersion(29)

    defaultConfig {
        minSdkVersion(16)
        targetSdkVersion(29)
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

//    implementation project(path: ':buildSrc')
    implementation(Dependencies.Libs.kotlin)
    implementation(Dependencies.CommonLibs.coroutines)
    implementation(Dependencies.CommonLibs.arrowCore)
    implementation(Dependencies.CommonLibs.arrowSyntax)
    kapt(Dependencies.CommonLibs.arrowMeta)

    implementation(Dependencies.JetpackLibs.lifecycleExtensions)
    implementation(Dependencies.JetpackLibs.livedataKtx)

    implementation(Dependencies.JetpackLibs.room)
    implementation(Dependencies.JetpackLibs.roomKtx)
    kapt(Dependencies.JetpackLibs.roomCompiler)

    implementation(Dependencies.CommonLibs.gson)
    implementation(Dependencies.CommonLibs.retrofit)
    implementation(Dependencies.CommonLibs.retrofitGson)

    testImplementation(Dependencies.TestLibs.junit)
    testImplementation(Dependencies.TestLibs.mockitoKotlin)

    // hilt
    implementation(Dependencies.CommonLibs.hilt)
    kapt(Dependencies.CommonLibs.hiltCompiler)
}
