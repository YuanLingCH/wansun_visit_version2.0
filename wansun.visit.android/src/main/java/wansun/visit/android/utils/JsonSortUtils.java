package wansun.visit.android.utils;


/**
 * Created by User on 2020/6/10.
 */


import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/**
 * json 字符串key 首字母排序
 */
public class JsonSortUtils {
    private static Comparator<String> getComparator() {
        Comparator<String> c = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        };

        return c;
    }

    public static void sort(JsonElement e) {
        if (e.isJsonNull()) {
            return;
        }

        if (e.isJsonPrimitive()) {
            return;
        }

        if (e.isJsonArray()) {
            JsonArray a = e.getAsJsonArray();
            for (Iterator<JsonElement> it = a.iterator(); it.hasNext(); ) {
                sort(it.next());
            }
            return;
        }

        if (e.isJsonObject()) {
            Map<String, JsonElement> tm = new TreeMap<String, JsonElement>(getComparator());
            for (Map.Entry<String, JsonElement> en : e.getAsJsonObject().entrySet()) {
                tm.put(en.getKey(), en.getValue());
            }

            for (Map.Entry<String, JsonElement> en : tm.entrySet()) {
                e.getAsJsonObject().remove(en.getKey());
                e.getAsJsonObject().add(en.getKey(), en.getValue());
                sort(en.getValue());
            }
            return;
        }
    }

    public static String sortJsonForKey(String json) {

//        Gson gson= new GsonBuilder().setPrettyPrinting().create(); 这行可以格式化输出json
        Gson gson=new Gson();
        JsonParser p = new JsonParser();
        JsonElement e = p.parse(json);
        sort(e);
        return gson.toJson(e);
    }



}
