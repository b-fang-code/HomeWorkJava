package HomeWorkJava003;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка
public class task02 {
    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add((int) (rnd.nextInt(1, 100)));
        }
        System.out.printf("Исходный список: %s,", list);
        int minNumber = Collections.min(list);
        int maxNumber = Collections.max(list);
        double sumNumber = 0;
        for (int i = 0; i < list.size(); i++) {
            sumNumber = sumNumber + list.get(i);
        }
        System.out.printf("\nМинимальное значение списка: %d", minNumber);
        System.out.printf("\nМаксимальное значение списка: %d", maxNumber);
        System.out.println("\nСредне арифметическое элементов списка: " + sumNumber / list.size());
    }
}
