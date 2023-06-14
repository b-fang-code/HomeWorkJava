package HomeWorkJava006;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        noteBook();
    }

    private static void noteBook() {
        Notebook Msi = new Notebook();
        Notebook Asus = new Notebook();
        Notebook Lenovo = new Notebook();
        Notebook Xiaomi = new Notebook();
        Notebook Hp = new Notebook();
        Notebook Apple = new Notebook();

        Msi.addNotebook("Msi", 32, 500, "Intel", 17);
        Asus.addNotebook("Asus", 8, 240, "Intel", 16);
        Lenovo.addNotebook("Lenovo", 16, 256, "AMD", 15);
        Xiaomi.addNotebook("Xiaomi", 8, 120, "AMD", 16);
        Hp.addNotebook("HP", 16, 240, "Intel", 17);
        Apple.addNotebook("MacBook", 32, 500, "Intel", 15);

        List<Notebook> newList = new ArrayList<>();
        newList.add(Msi);
        newList.add(Asus);
        newList.add(Lenovo);
        newList.add(Xiaomi);
        newList.add(Hp);
        newList.add(Apple);

        System.out.println("Какое минимальное количество оперативной памяти Вам необходимо? ");
        Scanner in = new Scanner(System.in);
        Integer size = in.nextInt();

        System.out.println("Можем Вам предложить: ");
        for (Notebook notebook : newList) {
            if (notebook.ramSize >= size) {
                System.out.println(notebook);
            }
        }
    }
}
