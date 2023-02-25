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
        int minHeight = scanner.nextInt();
        int maxHeight = 0;
        do {
            System.out.println("Podaj wzrost maksymalny");
            maxHeight = scanner.nextInt();
        } while (maxHeight < minHeight);

//        BMI = (weight) / (height * height)
        System.out.println("Podaj wagę minimalną: " + minWeight);
        System.out.println("Podaj wagę maksymalną: " + maxWeight);
        System.out.println("Podaj wzrost minimalny: " + minHeight);
        System.out.println("Podaj wzrost maksymalny: " + maxHeight);

//        int bmi = (int) (minWeight / ((minHeight * minHeight)/10000));


        int[][] tab = new int[(int) (maxHeight-minHeight+2)][maxWeight-minWeight+2];
        int minH = minHeight;
        int minH1 = minHeight;
        int maxH = maxHeight;
        int minW = minWeight;
        int minW1 = minWeight;
        int maxW = maxWeight;

        for (int i = 1; i < (maxW-minW+2) ; i++) {
            for (int j = 1; j < (maxH-minH+2); j++) {
                tab[j][i] = (minWeight*10000) / (minHeight * minHeight);
                minHeight++;
            }
            minHeight = minH1;
            minWeight++;
        }

        for (int i = 1; i < (maxW-minW+2); i++) {
            tab[0][i] = minW1;
            minW1++;
        }
        for (int i = 1; i < (maxH-minH+2); i++) {
            tab[i][0] = minH1;
            minH1++;
        }

        for (int i = 0; i < (maxW-minW+2) ; i++) {
            for (int j = 0; j < (maxH - minH + 2); j++) {
                System.out.printf("%-5s", tab[j][i]);
            }
            System.out.println();
        }



    }
}
