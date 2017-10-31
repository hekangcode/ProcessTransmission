package com.hekang.processtransmission.contentprovider.db;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;

/**
 * Created by net_c on 2017/7/28.
 */

public class OtherActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ContentResolver cr = getContentResolver();
        ContentValues cv = new ContentValues();
        cv.put("username", "xiaoming");
        cv.put("password", "123456789");
        cr.insert(Uri.parse("content://com.cantv.user"), cv);
        /*//得到内容分解器对象
        ContentResolver cr = getContentResolver();
        ContentValues cv = new ContentValues();
        cv.put("name", "小方");
        cv.put("phone", 138856);
        cv.put("money", 3000);
        //url:内容提供者的主机名
        cr.insert(Uri.parse("content://com.itheima.person"), cv);*/
    }
}
