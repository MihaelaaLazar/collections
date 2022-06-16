package homework.collections;

import java.util.*;

public class Ex1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            if (next % 2 == 0) {
                System.out.println(next);
            }
        }

        System.out.println("==============================");

        Set<String> set = new HashSet<>();
        set.add("aaa");
        set.add("aaa");
        set.add("aaa");

        Iterator<String> itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("==============================");

        Map<String, Integer> map = new HashMap<>();
        map.put("a", 4);
        map.put("b", 5);
        map.put("c", 6);
        map.put("d", 10);
        map.put("e", 11);
        map.put("f", 12);

        map.forEach((key, value) -> {
            if (value > 10) {
                System.out.println(key);
            }
        });
    }
}
