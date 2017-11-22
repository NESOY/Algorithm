package BaekJoon;

import java.util.Scanner;

/**
 * Created by nesoy on 2017. 10. 27..
 */
public class Solution_1463 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] score = new int[size + 3];
        score[1] = 0;
        score[2] = 1;
        score[3] = 1;
        if (size > 3) {
            for (int n = 4; n <= size; n++) {
                int min = score[n - 1] + 1;
                if (n % 2 == 0) {
                    min = Math.min(min, score[n / 2] + 1);
                }
                if (n % 3 == 0) {
                    min = Math.min(min, score[n / 3] + 1);
                }
                score[n] = min;
            }

        }
        System.out.println(score[size]);
    }
}
