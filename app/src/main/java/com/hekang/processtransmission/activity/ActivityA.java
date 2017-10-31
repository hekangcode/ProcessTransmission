package com.hekang.processtransmission.activity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

import com.hekang.processtransmission.R;

/**
 * Created by net_c on 2017/7/28.
 */

public class ActivityA extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
        Button button = (Button) findViewById(R.id.btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("com.abc.activity.b", Uri.parse("bbb://123456789"));
                intent.putExtra("key" , "a");
                intent.putExtra("value" , "aaaa");
                startActivity(intent);
            }
        });
    }
}
