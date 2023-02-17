package zadania.testowe.czesc1.zadanie4.A;

import java.util.Arrays;
import java.util.Scanner;

public class MainA {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj wagę minimalną");
        int minWeight = scanner.nextInt();
        int maxWeight = 0;
        do {
            System.out.println("Podaj wagę maksymalną");
            maxWeight = scanner.nextInt();
        } while (maxWeight < minWeight);
        System.out.println("Podaj wzrost minimalny");
        double minHeight = scanner.nextDouble();
        double maxHeight = 0;
        do {
            System.out.println("Podaj wzrost maksymalny");
            maxHeight = scanner.nextDouble();
        } while (maxHeight < minHeight);

//        BMI = (weight) / (height * height)
        System.out.println("Podaj wagę minimalną: " + minWeight);
        System.out.println("Podaj wagę maksymalną: " + maxWeight);
        System.out.println("Podaj wzrost minimalny: " + minHeight);
        System.out.println("Podaj wzrost maksymalny: " + maxHeight);

//        int bmi = (int) (minWeight / ((minHeight * minHeight)/10000));


        int[][] tab = new int[(int) (maxHeight-minHeight+2)][maxWeight-minWeight+2];

    }
}
