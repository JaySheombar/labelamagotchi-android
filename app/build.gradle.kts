plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("kapt")
    id("dagger.hilt.android.plugin")
    id("org.jetbrains.kotlin.plugin.serialization")
}

android {
    namespace = ProjectConfig.namespace
    compileSdk = ProjectConfig.compileSdk

    defaultConfig {
        applicationId = ProjectConfig.applicationId
        minSdk = ProjectConfig.minSdk
        targetSdk = ProjectConfig.targetSdk
        versionCode = ProjectConfig.versionCode
        versionName = ProjectConfig.versionName

        testInstrumentationRunner = ProjectConfig.testInstrumentationRunner
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = true
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }

    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.3.1"
    }

    tasks.withType<Test> {
        useJUnitPlatform()
    }

    packagingOptions {
        exclude("META-INF/AL2.0")
        exclude("META-INF/LGPL2.1")
    }
}

dependencies {
    implementation(project(Modules.Core))

    implementation(AndroidX.Core)
    implementation(AndroidX.LifecycleRuntime)

    implementation(Compose.ActivityCompose)
    implementation(Compose.Ui)
    implementation(Compose.Preview)
    implementation(Compose.Material)
    implementation(Compose.Navigation)
    implementation(Compose.HiltNavigation)
    implementation(Compose.LifecycleRunTime)
    implementation(Compose.LifecycleViewModel)

    implementation(DaggerHilt.Core)
    kapt(DaggerHilt.Compiler)

    implementation(Kotlin.CoroutinesCore)
    implementation(Kotlin.CoroutinesAndroid)

    implementation(Kotlin.Serialization)

    androidTestImplementation(Compose.UiTest)
    androidTestImplementation(Testing.jUnitKtx)

    testImplementation(Testing.jUnitApi)
    testImplementation(Testing.jUnitParams)
    testImplementation(Kotlin.CoroutinesTest)

    testRuntimeOnly(Testing.Engine)
}

kapt { correctErrorTypes = true }