package wansun.visit.android.utils;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Created by User on 2020/6/19.
 */

public class JsonMapUtil {
    /**

     *   将json 数组转换为Map 对象

     * @param jsonString

     * @return

     */

    public static Map<String, Object> getMap(String jsonString)

    {
        JSONObject jsonObject;
        try
        {
            jsonObject = new JSONObject(jsonString);
           Iterator<String> keyIter = jsonObject.keys();
            String key;
            Object value;
            Map<String, Object> valueMap = new HashMap<String, Object>();
            while (keyIter.hasNext())
            {
                key = (String) keyIter.next();
                value = jsonObject.get(key);
                valueMap.put(key, value);
            }
            return valueMap;
        }
        catch (JSONException e)
        {
            e.printStackTrace();
        }

        return null;

    }



    /**
     * 把json 转换为ArrayList 形式
     * @return
     */
    public static List<Map<String, Object>> getList(String jsonString) {
        List<Map<String, Object>> list = null;
        try {
            JSONArray jsonArray = new JSONArray(jsonString);
            JSONObject jsonObject;
            list = new ArrayList<Map<String, Object>>();
            for (int i = 0; i < jsonArray.length(); i++) {
                jsonObject = jsonArray.getJSONObject(i);
                list.add(getMap(jsonObject.toString()));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    }
