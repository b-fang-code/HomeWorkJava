package HomeWorkJava002;

import java.io.FileWriter;

//Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод,
// который запишет эту строку в простой текстовый файл, обработайте исключения.
public class task02 {
    public static void main(String[] args) {
        stringTest();
    }

    private static void stringTest() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            sb.append("TEST ");
        }
        try {
            FileWriter file1 = new FileWriter("file.txt");
            file1.write(String.valueOf(sb));
            file1.flush();
        } catch (Exception e) {
            System.out.println("Fail!");
        }
    }
}
