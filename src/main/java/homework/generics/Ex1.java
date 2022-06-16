package homework.generics;

public class Ex1 {
    public static void main(String... args) {
        Integer[] intArray = {1, 2, 3, 4, 5};

        printArray(intArray);
        exchange(intArray, 0, 3); // the output should be: " 4 2 3 1 5"
        System.out.println("----------------------------------------------------");
        printArray(intArray);
    }
    static <E> void exchange(E[] array, int firstIndex, int secondIndex) {
        E temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }

    static <E> void printArray(E... elements) {
        for (E element : elements) {
            System.out.println(element);
        }
    }
}