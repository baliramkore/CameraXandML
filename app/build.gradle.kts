plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
}

android {
    namespace = "com.rbk.cameraxandml"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.rbk.cameraxandml"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
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
        jvmTarget = "1.8"
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    // CameraX core library
    implementation ("androidx.camera:camera-core:1.2.2")

    // CameraX camera2 implementation
    implementation ("androidx.camera:camera-camera2:1.2.2")

    // CameraX lifecycle library (to integrate with LifecycleOwner)
    implementation ("androidx.camera:camera-lifecycle:1.2.2")

    // CameraX view (for PreviewView)
    implementation ("androidx.camera:camera-view:1.3.0")

    // Optional: CameraX extensions (for advanced effects)
    implementation ("androidx.camera:camera-extensions:1.3.0")

    // ML Kit Barcode Scanning
    implementation ("com.google.mlkit:barcode-scanning:17.0.3")
}