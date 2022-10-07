package task2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите x:");
        double x = scanner.nextDouble();
        System.out.println("Введите y:");
        double y = scanner.nextDouble();
        System.out.println(getAnswer(x, y));
    }

    public static boolean getAnswer(double x, double y){
        if (y >= 0 && y <= 5 && x <= 4 && x >= -4)
                return true;
        if (y <= 0 && y >= -3 && x <= 6 && x >= -6)
                return true;
        else return  false;
    }
}
