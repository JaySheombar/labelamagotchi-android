object Kotlin {
    const val version = "1.7.10"

    // Coroutines
    private const val coroutinesVersion = "1.6.4"
    const val CoroutinesCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$coroutinesVersion"
    const val CoroutinesAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:$coroutinesVersion"
    const val CoroutinesTest = "org.jetbrains.kotlinx:kotlinx-coroutines-test:$coroutinesVersion"

    // KotlinSerialization: https://github.com/Kotlin/kotlinx.serialization/releases
    private const val serializationVersion = "1.4.0"
    const val Serialization = "org.jetbrains.kotlinx:kotlinx-serialization-json:$serializationVersion"
}