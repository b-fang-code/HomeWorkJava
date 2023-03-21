package HomeWorkJava005;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Task01 {
    public static void main(String[] args) {
        phoneBook();
    }
    private static void phoneBook(){
        Map<String, ArrayList<String>> phoneBook = new HashMap<>();
        phoneBook.put("Иванов", new ArrayList<>(Arrays.asList("+7 987-342-44-22", "+7 874 743-43-32")));
        phoneBook.put("Петров ", new ArrayList<>(Arrays.asList("+7 987-446-54-23")));
        phoneBook.put("Сидоров", new ArrayList<>(Arrays.asList("+7 955-422-27-20", "+7-744-017-23-88")));
        phoneBook.put("Кузнецов", new ArrayList<>(Arrays.asList("+7 224 956-43-22")));
        phoneBook.put("Васильев", new ArrayList<>(Arrays.asList("+7 222-855-22-33", "+7 874 556-65-11")));
        for (String key : phoneBook.keySet()){
            System.out.print(key + " : ");
            for (String phone: phoneBook.get(key)){
                System.out.print(phone + "   ");
            }
            System.out.println();
        }
    }
}
