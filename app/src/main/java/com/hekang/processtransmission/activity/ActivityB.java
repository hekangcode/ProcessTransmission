package com.hekang.processtransmission.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by net_c on 2017/7/28.
 */

public class ActivityB extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getIntent().getData() != null) {
            Bundle bundle = getIntent().getExtras();
            String uri = getIntent().getData().getHost();   // 获取传递bbb://后面的数据
            String key = bundle.getString("key", "000");
            String value = bundle.getString("value", "000");
            Log.i("Main", "Uri=" + uri);
            Log.i("Main", "key=" + key);
            Log.i("Main", "value=" + value);
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "ActivityB", Toast.LENGTH_SHORT).show();
    }
}
