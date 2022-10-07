package task7;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите размер массива:");
        int n = scanner.nextInt();
        if (n < 1){
            System.out.println("Размер массива должен быть больше 0!");
            return;
        }
        System.out.println(Arrays.toString(shellSort(createArray(n))));
    }

    private static Double[] createArray(int n) {
        var arr = new Double[n];
        for(int i = 0; i < n; i++) {
            System.out.println("Введите " +i+"-й элемент массива:");
            arr[i] = scanner.nextDouble();
        }
        return arr;
    }

    public static Double[] shellSort(Double[] array) {
        int i = 0;
        while (i < array.length - 1){
            if (array[i] > array[i+1]){
                double temp = array[i+1];
                array[i+1] = array[i];
                array[i] = temp;
                if(i > 0)
                    i--;
            }
            else {
                i++;
            }
        }
        return array;
    }

}
