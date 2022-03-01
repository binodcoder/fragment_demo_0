package com.cct.bca2016;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView bca2016;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bca2016=(TextView)findViewById(R.id.tv_bca2016);
        bca2016.setText(
                "MOBILE TECHNOLOGY"
        );
    }
}

