package HomeWorkJava001;

import java.util.Scanner;

// ЗАДАЧА: Написать метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true,
// не високосный - false). Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
public class task02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите год: ");
        int year = Integer.parseInt(in.next());
        boolean value = false;
        if ((year % 4 == 0) & (year % 100 != 0) | (year % 400 == 0)) {
            value = true;
        }
        System.out.println(value);
    }
}
