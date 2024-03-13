plugins {
    id("com.android.application")
    id("com.google.gms.google-services")
}

android {
    namespace = "com.muss.pamoja_prep"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.muss.pamoja_prep"
        minSdk = 21
        //noinspection OldTargetApi
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        multiDexEnabled = true
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
            signingConfig = signingConfigs.getByName("debug")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    buildFeatures {
        viewBinding = true
        dataBinding = true

    }
}

dependencies {



    implementation("androidx.asynclayoutinflater:asynclayoutinflater-appcompat:1.1.0-alpha01")
    implementation("androidx.appcompat:appcompat-resources:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("com.google.firebase:firebase-database:20.3.1")
    implementation("androidx.cardview:cardview:1.0.0")
    implementation("androidx.mediarouter:mediarouter:1.6.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    implementation(platform("com.google.firebase:firebase-bom:32.7.0"))
    implementation("com.google.android.gms:play-services-auth:21.0.0")
    implementation("androidx.credentials:credentials:1.3.0-alpha01")
    implementation("androidx.test:orchestrator:1.4.2")
    implementation("com.google.firebase:firebase-database-connection:16.0.2")
    //implementation("androidx.compose.ui:ui-android:1.6.2")

    implementation("androidx.recyclerview:recyclerview-selection:1.1.0")
    implementation("androidx.recyclerview:recyclerview:1.3.2")

    implementation("com.google.firebase:firebase-encoders-json:18.0.1")
    implementation("com.google.code.gson:gson:2.10.1")
    implementation("com.stripe:stripe-android:8.1.0")

    implementation("androidx.navigation:navigation-compose:2.7.7")






    dependencies {
        // Import the BoM for the Firebase platform
        implementation(platform("com.google.firebase:firebase-bom:32.7.1"))

        // Add the dependency for the Realtime Database library
        // When using the BoM, you don't specify versions in Firebase library dependencies
        implementation("com.google.firebase:firebase-database")
    }

    //noinspection GradleCompatible
    // optional - needed for credentials support from play services, for devices running
    // Android 13 and below.
    implementation("androidx.credentials:credentials-play-services-auth:1.3.0-alpha01")
    implementation("androidx.legacy:legacy-support-core-ui:1.0.0")

    implementation("com.google.firebase:firebase-auth-ktx:22.3.1")
    implementation("com.firebaseui:firebase-ui-auth:8.0.2")

}