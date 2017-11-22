package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by nesoy on 2017. 10. 26..
 */
public class Solution_1546 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        double[] list = new double[size];
        int index = 0;
        for (int i = 0; i < size; i++) {
            list[index++] = scanner.nextInt();
        }

        Arrays.sort(list);
        double max = list[list.length - 1]; // MAX

        double avg = 0.0;
        for (double score : list) {
            avg += score / max * 100.0;
        }

        avg = Math.round(avg / size * 100.0) / 100.0;
        System.out.println(String.format("%.2f", avg));
    }

}
