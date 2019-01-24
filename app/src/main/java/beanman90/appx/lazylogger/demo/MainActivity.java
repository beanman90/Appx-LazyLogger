package beanman90.appx.lazylogger.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import beanman90.appx.lazylogger.LazyLogger;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LazyLogger.plant(new LazyLogger.DebugTree());
        LazyLogger.i("Hello Lazy Logger");
    }
}
