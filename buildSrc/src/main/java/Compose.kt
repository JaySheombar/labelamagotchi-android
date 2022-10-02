object Compose {
    private const val composeVersion = "1.3.0-beta03"
    const val Ui = "androidx.compose.ui:ui:$composeVersion"
    const val Preview = "androidx.compose.ui:ui-tooling-preview:$composeVersion"

    private const val activityComposeVersion = "1.6.0"
    const val ActivityCompose = "androidx.activity:activity-compose:$activityComposeVersion"

    private const val composeMaterialVersion = "1.2.1"
    const val Material = "androidx.compose.material:material:$composeMaterialVersion"

    // Navigation: https://developer.android.com/jetpack/androidx/releases/navigation
    private const val composeNavigationVersion = "2.5.2"
    const val Navigation = "androidx.navigation:navigation-compose:$composeNavigationVersion"

    // Lifecycle: https://developer.android.com/jetpack/androidx/releases/lifecycle
    private const val lifecycleVersion = "2.6.0-alpha02"
    const val LifecycleRunTime = "androidx.lifecycle:lifecycle-runtime-compose:$lifecycleVersion"
    const val LifecycleViewModel = "androidx.lifecycle:lifecycle-viewmodel-compose:$lifecycleVersion"

    // https://androidx.tech/artifacts/hilt/hilt-navigation-compose/
    private const val hiltNavigationVersion = "1.0.0"
    const val HiltNavigation = "androidx.hilt:hilt-navigation-compose:$hiltNavigationVersion"

    const val UiTest = "androidx.compose.ui:ui-test-junit4:$composeVersion"
}