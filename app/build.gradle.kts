plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)

    id("com.google.dagger.hilt.android")
    id("kotlin-kapt")
    kotlin("plugin.serialization") version "2.0.0"
    alias(libs.plugins.google.gms.google.services)
}

android {
    namespace = "com.example.snapeats"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.example.snapeats"
        minSdk = 24
        targetSdk = 36
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
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        compose = true
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    implementation(libs.firebase.auth)
    implementation(libs.androidx.credentials)
    implementation(libs.androidx.credentials.play.services.auth)
    implementation(libs.googleid)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)

    // Glide for image loading
    implementation("com.github.bumptech.glide:glide:4.16.0")
    implementation("com.github.bumptech.glide:compose:1.0.0-alpha.1")

    // Material Icons for Jetpack Compose
    implementation("androidx.compose.material:material-icons-extended:1.6.7") // Check your Compose version, adjust if needed

    // Hilt for Dependency Injection
    implementation("com.google.dagger:hilt-android:2.56.2")
    kapt("com.google.dagger:hilt-android-compiler:2.56.2")

    // Hilt Navigation for Compose
    implementation("androidx.hilt:hilt-navigation-compose:1.2.0")
    kapt("androidx.hilt:hilt-compiler:1.2.0")

    //coil
    implementation("io.coil-kt.coil3:coil-compose:3.2.0")

    //navigation
    val nav_version = "2.9.1"
    implementation("androidx.navigation:navigation-compose:${nav_version}")

    //serialization
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.8.1")

    // Pager and Pager Indicators (Accompanist)
    implementation("com.google.accompanist:accompanist-pager:0.34.0")
    implementation("com.google.accompanist:accompanist-pager-indicators:0.34.0")

// Payment Gateway (Razorpay)
    implementation("com.razorpay:checkout:1.6.40")

// Custom Bottom Navigation Bar (Canopas)
    implementation("com.canopas.compose-animated-navigationbar:bottombar:1.0.1")

// Lottie Animations for Compose (e.g., Place Order Dialog)
    implementation("com.airbnb.android:lottie-compose:6.1.0")

// System UI Controller (Accompanist)
    implementation("com.google.accompanist:accompanist-systemuicontroller:0.32.0")

// Splash Screen API
    implementation("androidx.core:core-splashscreen:1.0.1")


}