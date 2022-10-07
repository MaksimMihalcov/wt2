package task1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите x:");
        double x = scanner.nextDouble();
        System.out.println("Введите y:");
        double y = scanner.nextDouble();
        System.out.println("Answer: " + ((calculateNumerator(x,y)/calculateDenominator(x, y))+x));

    }

    public static double calculateNumerator(double x, double y){
        double sinusAnswer = Math.sin(x+y);
        return 1 + sinusAnswer * sinusAnswer;
    }

    public static double calculateDenominator(double x, double y){
        return 2 + Math.abs(x-((2*x)/(1+x*x*y*y)));
    }
}
