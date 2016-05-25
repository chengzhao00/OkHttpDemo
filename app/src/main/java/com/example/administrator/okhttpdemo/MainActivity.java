package com.example.administrator.okhttpdemo;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.administrator.okhttpdemo.http.OkHttpClientManager;
import com.squareup.okhttp.Request;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    private Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageView = (ImageView) findViewById(R.id.iv_test);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        context = this;
        //添加glide用法具体详情 查看这个博客 http://jcodecraeer.com/a/anzhuokaifa/androidkaifa/2015/0327/2650.html
        String imageurl = "http://hipubdev-10006628.file.myqcloud.com/admin/images/dcb28308-1219-4646-b345-ef9ebbcae8da.jpg";
        Glide.with(this).load(imageurl).into(imageView);
        getData();
    }
    private void getData(){
        String url = "http://120.27.165.140/herjk-server/user/userInfo?token=37a0fc2adeca4a4698f5b35ec0ea6aef";
        Map<String,String> params = new HashMap<>();
        params.put("username","asdf");
        params.put("password", "asdf");
        //post网络请求  //泛型直接封装进去Gson进行解析
        OkHttpClientManager.postAsyn(context, url, params, new OkHttpClientManager.ResultCallback<UserBean>() {
            @Override
            public void onError(Request request, Exception e) {
                //网络数据错误，解析错误
            }

            @Override
            public void onResponse(UserBean response) {
                //数据请求成功 返回解析完毕的对象
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
