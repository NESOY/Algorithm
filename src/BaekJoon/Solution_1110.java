package BaekJoon;

import java.util.Scanner;

/**
 * Created by nesoy on 2017. 10. 26..
 */
public class Solution_1110 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int origin = scanner.nextInt();

        int count = 0;
        int newValue = origin;

        do {
            int rightValue = newValue / 10;
            int leftValue = newValue % 10;
            int sumValue = rightValue + leftValue;

            newValue = leftValue * 10 + sumValue % 10;
            count++;
        } while (newValue != origin);
        System.out.println(count);
    }

}
