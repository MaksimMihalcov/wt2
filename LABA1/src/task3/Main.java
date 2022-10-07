package task3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите a:");
        double a = scanner.nextDouble();
        System.out.println("Введите b:");
        double b = scanner.nextDouble();
        if (a >= b){
            System.out.println("Левая граница не может быть больше либо равной правой!");
            return;
        }
        System.out.println("Введите h:");
        double h = scanner.nextDouble();
        double[][] answer = resolveInRange(a,b,h);
        for (double[] row : answer)
            System.out.println(Arrays.toString(row));
    }

    public static double[][] resolveInRange(double a, double b, double h) {
        int tableSize = (int)((b - a)/h);
        double[][] resultTable = new double[tableSize][2];
        int i = 0;
        while (i < tableSize){
            resultTable[i][0] = a;
            resultTable[i++][1] = Math.tan(a);
            a += h;
        }
        return resultTable;
    }
}
