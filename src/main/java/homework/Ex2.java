package homework;

import java.util.*;

public class Ex2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(7);
        list.add(4);
        list.add(5);
        list.add(2);
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(1);

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            if (list.indexOf(next) != list.lastIndexOf(next)) {
                iterator.remove();
            }
        }
        System.out.println(list);
        System.out.println("==============================");

        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);


        System.out.println("==============================");

        Set<String> set = new HashSet<>();
        for (Integer i : list) {
            set.add(i.toString());
        }

        System.out.println(set);

        System.out.println("==============================");

        Map<String, Integer> map = new HashMap<>();
        Iterator<String> strIter = set.iterator();
        Iterator<Integer> intIter = list.iterator();
        while(strIter.hasNext()){
             map.put(strIter.next(), intIter.next());
        }

        System.out.println(map );


    }
}
