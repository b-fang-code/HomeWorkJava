package HomeWorkJava003;

import java.util.ArrayList;
import java.util.Random;

// Пусть дан произвольный список целых чисел, удалить из него четные числа
public class task01 {
    public static void main(String[] args) {
        evenNumbers();
    }

    private static void evenNumbers() {
        ArrayList<Integer> originList = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < 10; i++) {
            originList.add((int) (rnd.nextInt(1, 100)));
        }
        System.out.printf("Исходный список: %s", originList);
        for (int i = 0; i < originList.size(); i++) {
            if (originList.get(i) % 2 == 0) {
                originList.remove(originList.get(i));
                i--;
            }
        }
        System.out.printf("\nИтоговый список: %s", originList);
    }
}
