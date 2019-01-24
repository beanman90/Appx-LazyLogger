# Appx - LazyLogger [![](https://jitpack.io/v/beanman90/Appx-LazyLogger.svg)](https://jitpack.io/#beanman90/Appx-LazyLogger) [![](https://jitpack.io/v/beanman90/Appx-LazyLogger/month.svg)](https://jitpack.io/#beanman90/Appx-LazyLogger)
Lazy Logger is open source for lazy android app developer, supports Release/Debug stage. Based-on Timber https://github.com/JakeWharton/timber. 

# [Read more document here](https://github.com/JakeWharton/timber)

**Getting Started**
---
In your `build.gradle`
```groovy
dependencies {
    releaseImplementation 'com.github.beanman90.Appx-LazyLogger:lazylogger:1.0.0'
    debugImplementation 'com.github.beanman90.Appx-LazyLogger:lazylogger-noop:1.0.0'
}
```

```java
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LazyLogger.plant(new LazyLogger.DebugTree());
        LazyLogger.i("Hello Lazy Logger");
    }
}

```

If your app on RELEASE, log messages will not be generated in logcat
