package HomeWorkJava005;

import java.util.*;

public class Task02 {
    public static void main(String[] args) {
        workList();
    }

    private static void workList() {
        Map<String, String> workList = new HashMap<>();
        workList.put("Иванов", "Иван");
        workList.put("Петрова", "Светлана");
        workList.put("Белова", "Кристина");
        workList.put("Мусина", "Анна");
        workList.put("Крутова", "Анна");
        workList.put("Юрин", "Иван");
        workList.put("Лыков", "Петр");
        workList.put("Чернов", "Павел");
        workList.put("Чернышов", "Петр");
        workList.put("Федорова", "Мария");
        workList.put("Светлова", "Марина");
        workList.put("Савина", "Мария");
        workList.put("Рыкова", "Мария");
        workList.put("Лугова", "Марина");
        workList.put("Владимирова", "Анна");
        workList.put("Мечников", "Иван");
        workList.put("Петин", "Петр");
        workList.put("Ежов", "Иван");

        int count = 0;
        TreeMap<String, Integer> numbValues = new TreeMap<>();
        for (String value : workList.values()) {
            for (String match : workList.values()) {
                if (value.equals(match)) {
                    count++;
                }
            }
            numbValues.put(value, count);
            count = 0;
        }
        List list1 = new ArrayList();
        count = 1;
        for (int i = 0; i < numbValues.size(); i++) {
            for (Map.Entry<String, Integer> name : numbValues.entrySet()) {
                if (name.getValue() == count) {
                    list1.add(name.getValue() + " раз(а) встречается " + name.getKey());
                    Collections.sort(list1);
                    Collections.reverse(list1);
                }
            }
            count = count + 1;
        }
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }
    }
}
