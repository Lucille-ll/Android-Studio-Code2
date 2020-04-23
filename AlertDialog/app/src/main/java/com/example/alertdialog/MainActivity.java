package com.example.alertdialog;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.app.AlertDialog;
import android.view.View;
import android.widget.TableLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView show;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void customView(View source)
    {
        // 加载\res\layout\login.xml界面布局文件
        TableLayout loginForm = (TableLayout) getLayoutInflater().inflate(R.layout.login, null);
        new AlertDialog.Builder(this)
                // 设置对话框的标题
                .setTitle("ANDROID APP")
                // 设置对话框显示的View对象
                .setView(loginForm)
                // 为对话框设置一个“确定”按钮
                .setPositiveButton("Sign in", (dialog, which) -> {
                    // 此处可执行登录处理
                    // 创建一个Toast提示信息
                    Toast toast = Toast.makeText(MainActivity.this,
                            "Sign in!!!!!!", Toast.LENGTH_SHORT); // 设置该Toast提示信息的持续时间
                    toast.show();
                })
                // 为对话框设置一个“取消”按钮
                .setNegativeButton("Cancel", (dialog, which) -> {
                    // 创建一个Toast提示信息
                    Toast toast = Toast.makeText(MainActivity.this,
                            "Exit!!!!!!", Toast.LENGTH_SHORT); // 设置该Toast提示信息的持续时间
                    toast.show();
                })
                // 创建并显示对话框
                .create().show();
    }
}
