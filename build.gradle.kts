

// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    val kotlin_version by extra("1.3.72")

    repositories {
        mavenCentral()
        google()
        jcenter()
        maven { setUrl("https://maven.google.com") }
        maven { setUrl("https://jitpack.io") }
    }
    dependencies {
        classpath(Dependencies.BuildPlugins.androidGradle)
        classpath(Dependencies.BuildPlugins.kotlinGradlePlugin)
        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}

allprojects {
    repositories {
        google()
        jcenter()
//        maven { setUrl("https://dl.bintray.com/arrow-kt/arrow-kt/") }
    }
}

// todo fix this block later
/*
subprojects {
    afterEvaluate {
        if (hasProperty("android")){
            android {
                compileSdkVersion(Dependencies.Android.compileSdkVersion)
                buildToolsVersion(Dependencies.Android.buildToolsVersion)

                defaultConfig {
                    applicationId = Dependencies.Android.applicationId
                    minSdkVersion(Dependencies.Android.minSdkVersion)
                    targetSdkVersion(Dependencies.Android.targetSdkVersion)
                    versionCode = Dependencies.Android.versionCode
                    versionName = Dependencies.Android.versionName

                    testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
                }

                dataBinding {
                    isEnabled = true
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
            }
        }
    }
}*/

// subprojects {
//    afterEvaluate { project ->
//        if (project.hasProperty('android')) {
//
//            android {
//                buildToolsVersion Configs.buildToolsVersion
//                        compileSdkVersion Configs.compileSdkVersion
//
//                        defaultConfig {
//                            minSdkVersion Configs.minSdkVersion
//                                    targetSdkVersion Configs.targetSdkVersion
//                                    testInstrumentationRunner "androidx.test.runner.AndroidJUnitRunner"
//                            vectorDrawables.useSupportLibrary = true
//                        }
//
//                compileOptions {
//                    sourceCompatibility Configs.javaVersion
//                            targetCompatibility Configs.javaVersion
//                }
//
//                buildFeatures {
//                    dataBinding true
//                }
//
//                lintOptions {
//                    tasks.lint.enabled = false
//                }
//            }
//        }
//    }
// }

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
