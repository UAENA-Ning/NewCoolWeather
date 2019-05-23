package com.coolweather.android;
/**
 * 1.用户点击右上角的标志后，弹出的是登录界面，但是下方有注册按钮
 * 2.这里需要调用数据库，如果数据库里面有数据，那么直接登录，如果没有，显示账号或者密码错误
 * 3.用户注册，简单的数字或者邮箱，密码显示不可见
 * 4.用户登录之后，跳转到天气主界面，只有登录之后才可以显示界面
 * 5.显示天气界面之后，右上角有一个账号管理，可以退出账号
 */

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class LogInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
    }
}
