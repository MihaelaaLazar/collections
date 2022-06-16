package homework.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Ex2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(11);
        list.add(2);
        list.add(4);
        list.add(6);

        countPrimeNumbers(list);//the output should be 2, because 11 and 2 are prime numbers
        System.out.println("----------------------------------------------------");

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(9);
        linkedList.add(2);
        linkedList.add(4);

        countPrimeNumbers(linkedList);//the output should be 1, because 2 is prime number
        System.out.println("----------------------------------------------------");
    }

    static <E> void countPrimeNumbers(Collection<E> list) {
        int count = 0;
        for (E element : list) {
            if (isPrime(element)) {
                count++;
            }
        }
        System.out.println(count);
    }

    static <E> boolean isPrime(E element){
        int number = (int) element;
        if (number == 1) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

}
