package m6.d30;

import java.io.*;
import java.util.*;

/**
 * 从文本中读取名字，并将重复的名字打印 显示重复次数
 * Created by Administrator on 2017/6/30.
 */
public class PrintSomeName {
    public static void main(String[] args) {
        //准备一个map，存放我拿到的数据
        Map<String,Integer> results = new HashMap<>();
        //得到一个输入流 拿到资源
        InputStream ips = PrintSomeName.class.getResourceAsStream("info.txt");

        BufferedReader in = new BufferedReader(new InputStreamReader(ips));
        String line;
        try {
            while ((line = in.readLine()) != null) {
                //做操作 将读取到的数据塞到Map中 key:为name;value为数量
                dealLine(line, results);
            }
            //对Map中的数据进行处理
            sortResults(results);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void dealLine(String line, Map map) {
        if (!"".equals(line.trim())) {
            String[] results = line.split(",");
            if (results.length == 3) {
                String name = results[1];
                Integer value = (Integer) map.get(name);
                if (value == null) value = 0;
                map.put(name, value + 1);
            }
        }
    }

    private static void sortResults(Map<String,Integer> result) {
        //使用TreeSet 是为了排序
        TreeSet sortedResults = new TreeSet(
                new Comparator() {
                    public int compare(Object o1, Object o2) {
                        User user1 = (User) o1;
                        User user2 = (User) o2;
                        if (user1.value < user2.value) {
                            return -1;
                        } else if (user1.value > user2.value) {
                            return 1;
                        } else {
                            return user1.name.compareTo(user2.name);
                        }
                    }
                }
        );
        for (Map.Entry<String, Integer> entry : result.entrySet()) {
            String name = entry.getKey();
            Integer value =  entry.getValue();
            if (value > 1) {
                sortedResults.add(new User(name, value));
            }
        }
        printResults(sortedResults);
    }

    //用于存储user数据
    private static class User {
        private String name;
        private Integer value;

        User(String name, Integer value) {
            this.name = name;
            this.value = value;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            User user = (User) o;

            if (name != null ? !name.equals(user.name) : user.name != null) return false;
            return value != null ? value.equals(user.value) : user.value == null;

        }

        @Override
        public int hashCode() {
            int result = name != null ? name.hashCode() : 0;
            result = 31 * result + (value != null ? value.hashCode() : 0);
            return result;
        }
    }

    //打印结果的方法
    private static void printResults(TreeSet sortedResults) {
        Iterator iterator = sortedResults.iterator();
        while (iterator.hasNext()) {
            User user = (User) iterator.next();
            System.out.println(user.name + ":" + user.value);
        }
    }


}