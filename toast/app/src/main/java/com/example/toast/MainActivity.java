package com.example.toast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button lion = findViewById(R.id.lion);
        // 为按钮的单击事件绑定事件监听器
        lion.setOnClickListener(view -> {
            // 创建一个Toast提示信息
            Toast toast = Toast.makeText(MainActivity.this,
                    "Lion!!!!!", Toast.LENGTH_SHORT); // 设置该Toast提示信息的持续时间
            toast.show();
        });
        Button tiger = findViewById(R.id.tiger);
        // 为按钮的单击事件绑定事件监听器
        tiger.setOnClickListener(view -> {
            // 创建一个Toast提示信息
            Toast toast = Toast.makeText(MainActivity.this,
                    "Tiger!!!!!", Toast.LENGTH_SHORT); // 设置该Toast提示信息的持续时间
            toast.show();
        });
        Button monkey = findViewById(R.id.monkey);
        // 为按钮的单击事件绑定事件监听器
        monkey.setOnClickListener(view -> {
            // 创建一个Toast提示信息
            Toast toast = Toast.makeText(MainActivity.this,
                    "Monkey!!!!!", Toast.LENGTH_SHORT); // 设置该Toast提示信息的持续时间
            toast.show();
        });
        Button dog = findViewById(R.id.dog);
        // 为按钮的单击事件绑定事件监听器
        dog.setOnClickListener(view -> {
            // 创建一个Toast提示信息
            Toast toast = Toast.makeText(MainActivity.this,
                    "Dog!!!!!", Toast.LENGTH_SHORT); // 设置该Toast提示信息的持续时间
            toast.show();
        });
        Button cat = findViewById(R.id.cat);
        // 为按钮的单击事件绑定事件监听器
        cat.setOnClickListener(view -> {
            // 创建一个Toast提示信息
            Toast toast = Toast.makeText(MainActivity.this,
                    "Cat!!!!!", Toast.LENGTH_SHORT); // 设置该Toast提示信息的持续时间
            toast.show();
        });
        Button elephant = findViewById(R.id.elephant);
        // 为按钮的单击事件绑定事件监听器
        elephant.setOnClickListener(view -> {
            // 创建一个Toast提示信息
            Toast toast = Toast.makeText(MainActivity.this,
                    "Elephant!!!!!", Toast.LENGTH_SHORT); // 设置该Toast提示信息的持续时间
            toast.show();
        });

    }

}

