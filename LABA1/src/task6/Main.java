package task6;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
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
        printMatrix(generateSquare(createArray(n)));
    }

    static void printMatrix(Double[][] arr){
        for (Double[] doubles : arr)
            System.out.println(Arrays.toString(doubles));
    }

    private static Double[] createArray(int n) {
        var arr = new Double[n];
        for(int i = 0; i < n; i++) {
            System.out.println("Введите " +i+"-й элемент массива:");
            arr[i] = scanner.nextDouble();
        }
        return arr;
    }

    public static Double[][] generateSquare(Double[] initArray) {
        LinkedList<Double> numbers = new LinkedList<>();
        FillQueue(initArray, numbers);

        Double[][] resultMatrix = new Double[initArray.length][initArray.length];
        CreateMatrix(resultMatrix, numbers);

        return resultMatrix;
    }

    private static void FillQueue(Double[] source, Queue<Double> dest){
        for (int i = 0; i < source.length; i++) {
            dest.add(source[i]);
        }
    }

    private static void CreateMatrix(Double[][] resultMatrix, Queue<Double> initQueue){
        for (int i = 0; i < initQueue.size(); i++) {
            resultMatrix[i] = initQueue.toArray(new Double[initQueue.size()]);
            initQueue.add(initQueue.element());
            initQueue.remove();
        }
    }
}
