package task5;
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
        System.out.println("Ответ: " + unnecessaryNumbersCount(createArray(n)));
    }


    public static int unnecessaryNumbersCount(int[] initialArray) {
        if (initialArray.length == 1){
            return 0;
        }
        return countNumbers(initialArray);
    }

    private static int countNumbers(int[] numbers){
        int resultCount = 0, currMaxNumber = numbers[0];
        for(int i = 0; i < numbers.length - 1; i++){
            if (numbers[i + 1] <= currMaxNumber){
                resultCount++;
            }
            else{
                currMaxNumber = numbers[i + 1];
            }
        }

        return resultCount;
    }

    private static int[] createArray(int n) {
        var arr = new int[n];
        for(int i = 0; i < n; i++) {
            System.out.println("Введите " +i+"-й элемент массива:");
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

}
