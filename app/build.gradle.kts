plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-android-extensions")
    id("dagger.hilt.android.plugin")
    id("kotlin-kapt")
}

android {
    compileSdk = Dependencies.Android.compileSdkVersion
    buildToolsVersion = Dependencies.Android.buildToolsVersion

    defaultConfig {
        applicationId = Dependencies.Android.applicationId
        minSdkVersion(Dependencies.Android.minSdkVersion)
        targetSdkVersion(Dependencies.Android.targetSdkVersion)
        versionCode = Dependencies.Android.versionCode
        versionName = Dependencies.Android.versionName

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildFeatures {
        // Enables Jetpack Compose for this module
        compose = true
        dataBinding = true
    }

    buildTypes {
        getByName(Dependencies.BuildTypes.RELEASE) {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_1_8.toString()
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.11.1"
    }
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    implementation(Dependencies.Libs.kotlin)
    implementation(Dependencies.Libs.androidxCoreKtx)
    implementation(Dependencies.Libs.androidXAppcompat)
    implementation(Dependencies.Libs.androidXConstraintLayout)

    testImplementation(Dependencies.TestLibs.junit)
    testImplementation(Dependencies.TestLibs.extJUnit)
    testImplementation(Dependencies.TestLibs.espresso)

    implementation(Dependencies.CommonLibs.coroutines)
    implementation(Dependencies.CommonLibs.coroutinesAndroid)
    implementation(Dependencies.CommonLibs.arrowCore)
    implementation(Dependencies.CommonLibs.arrowSyntax)
    kapt(Dependencies.CommonLibs.arrowSyntax)

    implementation(project(Dependencies.Modules.data))

    // jetPack
    implementation(Dependencies.JetpackLibs.lifecycleExtensions)
    implementation(Dependencies.JetpackLibs.viewModelKtx)
    implementation(Dependencies.JetpackLibs.livedataKtx)
    implementation(Dependencies.JetpackLibs.room)
    implementation(Dependencies.JetpackLibs.material)
    implementation(Dependencies.JetpackLibs.constraintLayout)
    implementation(Dependencies.JetpackLibs.navigationFragment)
    implementation(Dependencies.JetpackLibs.navigationUi)
    implementation(Dependencies.JetpackLibs.fragment)

    // hilt
    implementation(Dependencies.CommonLibs.hilt)
    kapt(Dependencies.CommonLibs.hiltCompiler)

    // retrofit and okhttp
    implementation(Dependencies.CommonLibs.retrofit)
    implementation(Dependencies.CommonLibs.retrofitGson)
    implementation(Dependencies.CommonLibs.okHttpInterceptor)
    implementation(Dependencies.CommonLibs.stetho)
    implementation(Dependencies.CommonLibs.stetho_OkHttp)

    // Glide

    implementation(Dependencies.CommonLibs.glide)
    kapt(Dependencies.CommonLibs.glideCompiler)

    // compose
    implementation(Dependencies.ComposeLibs.activityCompose)
    implementation(Dependencies.ComposeLibs.Animation)
    implementation(Dependencies.ComposeLibs.Material)
    implementation(Dependencies.ComposeLibs.viewModel)
    implementation(Dependencies.ComposeLibs.uiTooling)
    implementation(Dependencies.ComposeLibs.junit)
}
