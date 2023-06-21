import java.net.InetAddress;
import java.util.*;
public class Seminar_5 {
    public static void main(String[] args) {
        {
//            ArrayList<Integer> age = new ArrayList<>();
//            ArrayList<Integer> id = new ArrayList<>();
//
//            age.add(38);
//            age.add(27);
//            age.add(45);
//            age.add(41);
//            age.add(31);
//
//            id.add(0);
//            id.add(1);
//            id.add(2);
//            id.add(3);
//            id.add(4);
//
//            Collections.sort(id, (o1, o2) -> age.get(o1) - age.get(o2));
//
//            System.out.println(id);
//            id.forEach(n -> System.out.println(fam.get(n) + name.get(n) + age.get(n)));
        }

        Object o = new Object();
        o.hashCode();

        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "!");
        map.putIfAbsent(1, "j");
//        map.putAll();
        map.replace(1, "j");
        map.replace(1, "!", "j");
        map.remove(1);
        map.remove(1, "!");
        map.get(1);
        map.getOrDefault(1, "#");

        Set<Integer> se = map.keySet();
        for (int i = 0; i < se.size(); i++) {
            System.out.println(map.get((int) se.toArray()[i]));
        }

        for (String s : map.values()) {
            System.out.println(s);
        }

        map.containsValue("!");
        map.containsKey(1);

        map.compute(1, (key, value) -> value != null ? value + key : "0");
        map.computeIfPresent(1, (key, value) -> value == null ? value + "!" : "0");
        map.computeIfAbsent(1, value -> value != null ? value + "!" : "0");

        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();

        map.clear();
        for (int i = 0; i < 10; i++) {
            map1.put(i, i);
        }

        for (int i = 0; i < 10; i++) {
            map2.put(i, new Random().nextInt(5));
        }
        System.out.println(map1);
        System.out.println(map2);
        map1.replaceAll((key, value) -> map2.computeIfPresent(value, (k, v) -> v * key));
        System.out.println(map2);

    }

}
