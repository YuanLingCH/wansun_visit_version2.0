package wansun.visit.android.utils;

import android.content.Context;
import android.content.SharedPreferences;

import wansun.visit.android.bean.userBean;
import wansun.visit.android.global.waifangApplication;


/**
 * Created by Administrator on 2016/12/1.
 */
public class SharedUtils {
  static   SharedPreferences shared = waifangApplication.getInstence().getSharedPreferences("shared", Context.MODE_PRIVATE);
    public static void saveUser(userBean user) {

        shared.edit().putString("user", user.username + ":" + user.password).commit();
    }

    public static userBean getUser() {

        String value = shared.getString("user", "");
        //name:password
        String[] arr = value.split(":");
        if (arr == null || arr.length != 2) {
            return null;
        }
        userBean user = new userBean();
        user.username = arr[0];
        user.password = arr[1];
        return user;
    }
    public static void putString(String key,String value) {

        shared.edit().putString(key,value).commit();
    }
    public static String getString(String key) {

      return  shared.getString(key,"");
    }

    /**
     * 清楚里面的数据
     * @param key
     */
    public static void clear(String key){

        shared.edit().remove(key).commit();
    }

}
