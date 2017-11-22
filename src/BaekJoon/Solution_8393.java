package BaekJoon;

import java.util.Scanner;

/**
 * Created by nesoy on 2017. 10. 26..
 */
public class Solution_8393 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        System.out.println(getSum(size));
    }

    public static int getSum(int size) {
        int sum = 0;

        for (int i = 1; i <= size; i++) {
            sum += i;
        }

        return sum;
    }
}
