package BaekJoon;

import java.util.Scanner;

/**
 * Created by nesoy on 2017. 10. 26..
 */
public class Solution_1065 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        System.out.println(getHanNum(size));
    }

    public static int getHanNum(int value) {
        if (value < 100)
            return value;
        else {
            int sum = 99;
            for (int i = 100; i <= value; i++) {

                int max = i / 100;
                int mid = i / 10 % 10;
                int min = i % 10;
                if (max - mid == mid - min) {
                    sum++;
                }
            }
            return sum;
        }
    }
}
