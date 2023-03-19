package HomeWorkJava004;

import java.util.Collections;
import java.util.LinkedList;

public class Task02 {
    public static void main(String[] args) {

        reverseList();
    }
    private static void reverseList() {
        LinkedList<Integer> originList = new LinkedList<>();
        Collections.addAll(originList, 34, 54, 22, 113, 67, 32, 56);
        System.out.printf("Исходный список: %s", originList);
        Collections.reverse(originList);
        System.out.printf("\nИтоговый список: %s", originList);
    }
}
