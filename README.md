# TestKapt
## Kapt annotation processor bug with configuration cache

To reproduce:
   1. Make sure the build is clean and there's no configuration cache
   2. Run ./gradlew clean :di:assembleDebug :app:assembleDebug
   3. You should see the following error:
   ```
        1 problem was found storing the configuration cache.
        - Task `:app:kaptGenerateStubsDebugKotlin` of type `org.jetbrains.kotlin.gradle.internal.KaptGenerateStubsTask`: value 'provider(class org.jetbrains.kotlin.gradle.tasks.SourceRoots$ForJvm)' failed to unpack provider
   ```



