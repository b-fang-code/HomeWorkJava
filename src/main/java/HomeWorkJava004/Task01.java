package HomeWorkJava004;

import java.util.*;

public class Task01 {
    public static void main(String[] args) {
        app();
    }

    private static void app() {
        LinkedList<String> wordsList = new LinkedList<>();
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.print("\nВведите строку: ");
            String inputString = in.nextLine();

            if (inputString.isBlank()) {
                System.out.println("Строка не должна быть пустой!");
                continue;
            }
            if (inputString.equalsIgnoreCase("print")) {
                ListIterator<String> reverseList = wordsList.listIterator(wordsList.size());
                while (reverseList.hasPrevious()) {
                    System.out.print(reverseList.previous() + " ");
                }
            } else if (inputString.equalsIgnoreCase("revert")) {
                try {
                    wordsList.removeLast();
                    System.out.println("Последняя введённая строка удалена");
                } catch (Exception e) {
                    System.out.println("Список пустой!");
                }
            } else {
                wordsList.add(inputString);
            }
        }
    }
}
