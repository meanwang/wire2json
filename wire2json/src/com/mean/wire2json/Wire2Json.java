package com.mean.wire2json;

import android.util.Log;
import com.squareup.wire.Message;
import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * Created by meanwang on 2015/11/9.
 */
public class Wire2Json {
    public static final String TAG = Wire2Json.class.getSimpleName();
    public static String toJsonString(Message message){
        String result = "{";
        if(message == null){
            return result + "}";
        }
        Class<?> clazz = ((Object)message).getClass();
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields){
            try {
                //跳过static成员
                int modifiers = field.getModifiers();
                if(Modifier.isStatic(modifiers)){
                    continue;
                }
                String fieldName = field.getName();
                String fieldClassName = field.getType().getName();
                Object value = field.get(message);
                if(fieldClassName.equals(Integer.class.getName())
                        ||fieldClassName.equals(Long.class.getName())
                        ||fieldClassName.equals(Float.class.getName())
                        ||fieldClassName.equals(Double.class.getName())){
                    result += ("\"" + fieldName + "\":" + (value == null ? 0 : value) + ",");
                }else if(fieldClassName.equals(String.class.getName())){
                    result += ("\"" + fieldName + "\":\"" + (value == null ? "" : value)+ "\",");
                }else{
                    Class<?> superClass = field.getType().getSuperclass();
                    if(superClass != null && superClass == Message.class){
                        result += ("\"" + fieldName + "\":" + toJsonString((Message) value)+ ",");
                    }
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

    public static JSONObject toJson(Message message){
        try {
            return new JSONObject(toJsonString(message));
        } catch (JSONException e) {
            Log.e(TAG,e.getMessage());
            e.printStackTrace();
        }
        return null;
    }
}
