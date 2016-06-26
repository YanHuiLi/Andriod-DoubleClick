package com.example.archer.doubleclick;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private long firstClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {

        if (firstClick>0){//发现之前点过一次

            if (System.currentTimeMillis()-firstClick<500){//判断是否是双击

                Toast.makeText(this,"双击啦",Toast.LENGTH_SHORT).show();

                firstClick=0;
                return;
            }
        }

        firstClick = System.currentTimeMillis();
        System.out.println(firstClick);


    }
}
