package com.mean.wire2json;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;
import com.squareup.wire.Message;
import com.wesocial.apollo.protocol.protobuf.profile.AllUserInfo;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;

public class MainActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        test();
    }

    private void test() {
        AllUserInfo.Builder builder = new AllUserInfo.Builder();
        builder.inner_id(123456789L);
        builder.coin_num(300);
        AllUserInfo allUserInfo = builder.build();
        String json = Wire2Json.toJsonString(allUserInfo);
        Toast.makeText(this,json,Toast.LENGTH_SHORT).show();
        Log.e("test",json);
    }
}
