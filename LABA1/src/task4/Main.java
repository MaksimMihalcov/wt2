package task4;

import java.math.BigInteger;
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
        var arr = createArray(n);
        printIndexes(arr);
    }

    private static int[] createArray(int n) {
        var arr = new int[n];
        for(int i = 0; i < n; i++) {
            System.out.println("Введите " +i+"-й элемент массива:");
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    private static void printIndexes(int[] arr){
        System.out.println("Индексы  простых чисел в массиве:");
        for (int i = 0; i < arr.length; i++)
            if(checkIsItANaturalNumber(arr[i]))
                System.out.print(i+" ");
    }

    private static boolean checkIsItANaturalNumber(int num) {
        var bigInteger = BigInteger.valueOf(num);
        return bigInteger.isProbablePrime((int) Math.log(num));
    }

}