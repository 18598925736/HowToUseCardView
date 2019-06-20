package study.hank.com.mycardview;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv = findViewById(R.id.tv_current_sdk_int);
        final int currentSdkInt = Build.VERSION.SDK_INT;
        String s;
        if (currentSdkInt >= 21) {
            s = "当前版本是" + currentSdkInt + ";>=21 CardView的错误示范不会看到异常";
        } else {
            s = "当前版本是" + currentSdkInt + "; <21 CardView的错误示范会看到异常";
        }
        tv.setText(s);

        findViewById(R.id.tv_1).setOnClickListener(v -> {
            Intent i = new Intent(MainActivity.this, Example1Activity.class);
            startActivity(i);
        });
        findViewById(R.id.tv_2).setOnClickListener(v -> {
            Intent i = new Intent(MainActivity.this, Example2Activity.class);
            startActivity(i);
        });
        findViewById(R.id.tv_3).setOnClickListener(v -> {
            Intent i = new Intent(MainActivity.this, Example3Activity.class);
            startActivity(i);
        });
    }
}
