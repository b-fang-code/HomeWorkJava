package HomeWorkJava001;

//ЗАДАЧА:  Задать одномерный массив и найти в нем минимальный и максимальный элементы
public class task01 {
    public static void main(String[] args) {
        int[] array = {4, 9, 3, 12, 55, 2, 16};
        int min = array[0];
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min){
                min = array[i];
            }
            if (array[i] > max){
                max = array[i];
            }
        }
        System.out.printf("Минимальное значение массива %d", min);
        System.out.printf("\nМаксимальное  значение массива %d", max);
    }

}



