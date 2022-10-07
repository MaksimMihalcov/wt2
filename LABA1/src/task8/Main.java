package task8;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;
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
        System.out.println("Введите размер 2-го массива:");
        int k = scanner.nextInt();
        if (k < 1){
            System.out.println("Размер массива должен быть больше 0!");
            return;
        }
        System.out.println(Arrays.toString(findInsertPositions(createArray(n), createArray(k))));
    }

    private static Double[] createArray(int n) {
        var arr = new Double[n];
        for(int i = 0; i < n; i++) {
            System.out.println("Введите " +i+"-й элемент массива:");
            arr[i] = scanner.nextDouble();
        }
        return arr;
    }

    public static <T> T[] joinArrayGeneric(T[]... arrays) {
        int length = 0;
        for (T[] array : arrays) {
            length += array.length;
        }

        //T[] result = new T[length];
        final T[] result = (T[]) Array.newInstance(arrays[0].getClass().getComponentType(), length);

        int offset = 0;
        for (T[] array : arrays) {
            System.arraycopy(array, 0, result, offset, array.length);
            offset += array.length;
        }

        return result;
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

    public static int[] findInsertPositions(Double[] sourceNumbers, Double[] dest) {
        Double[] resultSorted = shellSort(joinArrayGeneric(sourceNumbers, dest));
        LinkedList<Integer> resultPositions = new LinkedList<>();
        for(int i = 0; i < resultSorted.length; i++){
            for(int j = 0; j < sourceNumbers.length; j++){
                if (resultSorted[i] == sourceNumbers[j])
                    resultPositions.add(i);
            }
        }

        return resultPositions.stream().mapToInt(i -> i).toArray();
    }
}
