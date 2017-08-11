package m6.d29;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * map怎么去遍历 4种方法
 * Created by Administrator on 2017/6/29.
 */
public class MapBL {

    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"test1");
        map.put(2,"test2");

        //方法1
        for(Integer key : map.keySet()){
            System.out.println("key = " + key);
        }
        for(String value : map.values()){
            System.out.println("value = " + value);
        }

        //方法2
        for(Map.Entry entry : map.entrySet()){
            System.out.println("key = " + entry.getKey() + "," + "value = " + entry.getValue());
        }

        //方法3
        Iterator<Map.Entry<Integer, String>> entries = map.entrySet().iterator();
        while (entries.hasNext()){
            Map.Entry<Integer,String> entry = entries.next();
            System.out.println("key = " + entry.getKey() + "," + "value = " + entry.getValue());
        }

        //方法4
        for (Integer key : map.keySet()) {
            String value = map.get(key);
            System.out.println("key = " + key + "," + "value = " + value);
        }
    }
}
