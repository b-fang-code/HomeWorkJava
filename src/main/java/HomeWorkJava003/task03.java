package HomeWorkJava003;

import java.util.ArrayList;

//Создать список типа ArrayList<String>. Поместить в него как строки, так и целые числа. Пройти по списку,
// найти и удалить целые числа
public class task03 {
    public static void main(String[] args) {
        clearList();
    }

    private static void clearList() {
        ArrayList <String>myList = new ArrayList<String>();
        myList.add("21");
        myList.add("peace");
        myList.add("45");
        myList.add("for");
        myList.add("51");
        myList.add("all");
        System.out.printf("Исходный список: %s", myList);

        myList.removeIf(el -> numberChecking(el));

        System.out.printf("\nИтоговый список: %s", myList);

    }
    private static boolean numberChecking(String value) {
        try {
            Integer.parseInt(value);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}

