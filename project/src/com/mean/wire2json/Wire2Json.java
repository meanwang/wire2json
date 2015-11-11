package com.mean.wire2json;

import android.text.TextUtils;
import android.util.Log;
import com.squareup.wire.Message;
import okio.ByteString;
import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.List;

/**
 * Created by meanwang on 2015/11/9.
 */
public class Wire2Json {
    public static final String TAG = Wire2Json.class.getSimpleName();

    public static String toJsonString(Message message,boolean long2String){
        String result = "{";
        if(message == null){
            return result + "}";
        }
        Class<?> clazz = ((Object)message).getClass();
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields){
            try {
                int modifiers = field.getModifiers();
                if(Modifier.isStatic(modifiers)){
                    break;
                }
                Object value = field.get(message);
                String variateStr = parseValue(value,long2String);
                if(!TextUtils.isEmpty(variateStr)) {
                    result += ("\"" + field.getName() + "\":" + parseValue(value, long2String));
                }
            } catch (IllegalAccessException e) {
                Log.e(TAG,e.getMessage());
                e.printStackTrace();
            }
        }
        if(result.endsWith(",")){
            result = result.substring(0,result.length() - 1);
        }
        return result + "}";
    }

    public static String toJsonString(Message message){
        return toJsonString(message,false);
    }

    public static JSONObject toJson(Message message,boolean long2String){
        try {
            return new JSONObject(toJsonString(message,long2String));
        } catch (JSONException e) {
            Log.e(TAG,e.getMessage());
            e.printStackTrace();
        }
        return null;
    }

    public static JSONObject toJson(Message message){
        try {
            return new JSONObject(toJsonString(message,false));
        } catch (JSONException e) {
            Log.e(TAG,e.getMessage());
            e.printStackTrace();
        }
        return null;
    }

    private static String parseValue(Object value,boolean long2String){
        String result = "";
        if(value == null){
            Log.d(TAG,"value is null,return.");
            return result;
        }
        if(value instanceof Integer
                ||value instanceof Float
                ||value instanceof Double){
            result += (value + ",");
        }else if(value instanceof Long){
            result += ((long2String ? "\"" : "") + value + (long2String ? "\"" : "") + ",");
        }else if(value instanceof Boolean){
            result += (((Boolean)value ? "true" : "false") + ",");
        }else if(value instanceof String){
            result += ("\"" + value+ "\",");
        }else if(value instanceof ByteString){
            result += ("\"" + ((ByteString)value).utf8()+ "\",");
        }else if(value instanceof List){
            result += "[";
            for (Object object : (List)value){
                result += parseValue(object,long2String);
            }
            if(result.endsWith(",")){
                result = result.substring(0,result.length() - 1);
            }
            result += "],";
        }else{
            Class<?> superClass = value.getClass().getSuperclass();
            if(superClass != null && superClass == Message.class){
                result += (toJsonString((Message)value,long2String) + ",");
            }
        }
        return result;
    }
}
