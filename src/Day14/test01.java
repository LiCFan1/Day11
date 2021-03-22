package Day14;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class test01 {
    public static void main(String[] args) {
        func5();

    }

    private static void func5() {
        LinkedHashMap<String,Integer> map = new LinkedHashMap<>();
        map.put("Li",0);
        map.put("Chao",1);
        map.put("Fan",2);
        for (String student : map.keySet()) {
            System.out.println(student+"+"+map.get(student));
        }
    }

    private static void func4() {
        HashMap<Student,Integer> map = new HashMap<>();
        map.put(new Student("li",18),0);
        map.put(new Student("Chao",19),1);
        map.put(new Student("li",18),2);
        for (Student student : map.keySet()) {
            System.out.println(student+"+"+map.get(student));
        }
    }

    private static void func3() {
        HashMap<String,Student> map = new HashMap<>();
        map.put("1",new Student("li",18));
        map.put("2",new Student("Chao",19));
        map.put("3",new Student("Fan",19));
        for(String key:map.keySet()){
            System.out.println(key+"--"+map.get(key));
        }
    }

    private static void func2() {
        Map<String ,Integer> map = new HashMap<>();
        map.put("Li",18);
        map.put("Chao",19);
        map.put("fan",17);
        Set<Map.Entry<String, Integer>> entry = map.entrySet();
        for (Map.Entry<String, Integer> stringIntegerEntry : entry) {
            String key = stringIntegerEntry.getKey();
            Integer value = stringIntegerEntry.getValue();
            System.out.println(key+"+"+value);
        }
    }

    private static void func1() {
        Map<String ,Integer> map = new HashMap<>();
        map.put("Li",18);
        map.put("Chao",19);
        map.put("fan",17);
        Set<String> set = map.keySet();
        for (String s : set) {
            System.out.println(s+"--"+map.get(s));
        }
    }
}
