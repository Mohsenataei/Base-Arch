object Dependencies {
    object Versions {
        const val kotlin = "1.5.21"
        const val gradle = "7.0.0"
        const val activityCompose = "1.4.0"
        const val compose = "1.1.1"
        const val composeViewModel = "2.4.1"
        const val arrow = "0.10.4"
        const val ktlint = "0.37.2"
        const val coroutines = "1.3.3"
        const val gradleVersions = "0.27.0"
        const val hilt = "2.38.1"
        const val arch = "2.2.0"
        const val archTest = "2.1.0"
        const val material = "1.0.0"
        const val constraintLayout = "1.1.3"
        const val room = "2.4.1"
        const val dagger = "2.25.4"
        const val okHttp = "3.8.1"
        const val gson = "2.8.6"
        const val retrofit = "2.7.1"
        const val stetho = "1.5.1"
        const val glide = "4.11.0"
        const val junit = "4.12"
        const val testRunner = "1.2.0"
        const val espresso = "3.2.0"
        const val mockitoKotlin = "1.6.0"
        const val navigationComponent = "2.3.0"
        const val fragment = "1.2.5"
    }

    object BuildPlugins {
        const val androidGradle = "com.android.tools.build:gradle:${Versions.gradle}"
        const val kotlinGradlePlugin =
            "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
        const val hiltPlugin = "com.google.dagger:hilt-android-gradle-plugin:${Versions.hilt}"
    }

    object Android {
        const val buildToolsVersion = "30.0.1"
        const val minSdkVersion = 21
        const val targetSdkVersion = 29
        const val compileSdkVersion = 29
        const val applicationId = "com.mohsen.architecture"
        const val versionMajor = 1
        const val versionMinor = 1
        const val versionPatch = 9
        const val versionCode = 1
        const val versionName = "1.0"
    }

    object BuildTypes {
        const val RELEASE = "release"
        const val DEBUG = "debug"
    }

    object Libs {
        const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}"
        const val androidxCoreKtx = "androidx.core:core-ktx:1.3.1"
        const val androidXAppcompat = "androidx.appcompat:appcompat:1.2.0"
        const val androidXConstraintLayout = "androidx.constraintlayout:constraintlayout:2.0.1"
    }

    object Modules {
        const val data = ":data"
    }

    object JetpackLibs {
        const val lifecycleExtensions = "androidx.lifecycle:lifecycle-extensions:${Versions.arch}"
        const val lifecycleKtx = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.arch}"
        const val viewModelKtx = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.arch}"
        const val livedataKtx = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.arch}"
        const val room = "androidx.room:room-runtime:${Versions.room}"
        const val roomKtx = "androidx.room:room-ktx:${Versions.room}"
        const val roomCompiler = "androidx.room:room-compiler:${Versions.room}"
        const val material = "com.google.android.material:material:${Versions.material}"
        const val annotations = "androidx.annotation:annotation:${Versions.material}"
        const val constraintLayout =
            "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
        const val navigationFragment =
            "androidx.navigation:navigation-fragment:${Versions.navigationComponent}"
        const val navigationUi = "androidx.navigation:navigation-ui:${Versions.navigationComponent}"
        const val fragment = "androidx.fragment:fragment-ktx:${Versions.fragment}"
    }

    object CommonLibs {

        const val coroutines =
            "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}"
        const val coroutinesAndroid =
            "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines}"
        const val arrowCore = "io.arrow-kt:arrow-core:${Versions.arrow}"
        const val arrowSyntax = "io.arrow-kt:arrow-syntax:${Versions.arrow}"
        const val arrowMeta = "io.arrow-kt:arrow-meta:${Versions.arrow}"
        const val dagger = "com.google.dagger:dagger:${Versions.dagger}"
        const val daggerCompiler = "com.google.dagger:dagger-compiler:${Versions.dagger}"
        const val daggerAndroid = "com.google.dagger:dagger-android-support:${Versions.dagger}"
        const val daggerAndroidCompiler =
            "com.google.dagger:dagger-android-processor:${Versions.dagger}"
        const val hilt = "com.google.dagger:hilt-android:${Versions.hilt}"
        const val hiltCompiler = "com.google.dagger:hilt-android-compiler:${Versions.hilt}"
        const val gson = "com.google.code.gson:gson:${Versions.gson}"
        const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
        const val retrofitGson = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"
        const val okHttpInterceptor = "com.squareup.okhttp3:logging-interceptor:${Versions.okHttp}"
        const val stetho = "com.facebook.stetho:stetho:${Versions.stetho}"
        const val stetho_OkHttp = "com.facebook.stetho:stetho-okhttp3:${Versions.stetho}"
        const val glide = "com.github.bumptech.glide:glide:${Versions.glide}"
        const val glideCompiler = "com.github.bumptech.glide:compiler:${Versions.glide}"
    }

    object ComposeLibs {
        const val activityCompose = "androidx.activity:activity-compose:${Versions.activityCompose}"
        const val Material = "androidx.compose.material:material:${Versions.compose}"
        const val Animation = "androidx.compose.animation:animation:${Versions.compose}"
        const val uiTooling = "androidx.compose.ui:ui-tooling:${Versions.compose}"
        const val viewModel = "androidx.lifecycle:lifecycle-viewmodel-compose:${Versions.composeViewModel}"
        const val junit = "androidx.compose.ui:ui-test-junit4:${Versions.compose}"
    }

    object TestLibs {
        const val junit = "junit:junit:${Versions.junit}"
        const val testRunner = "androidx.test:runner:${Versions.testRunner}"
        const val esperesso = "androidx.test.espresso:espresso-core:${Versions.espresso}"
        const val mockitoKotlin = "com.nhaarman:mockito-kotlin-kt1.1:${Versions.mockitoKotlin}"
        const val archTesting = "androidx.arch.core:core-testing:${Versions.archTest}"
        const val extJUnit = "androidx.test.ext:junit:1.1.2"
        const val espresso = "androidx.test.espresso:espresso-core:3.3.0"
    }
}
