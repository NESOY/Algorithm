package BaekJoon;

import java.util.Scanner;

/**
 * Created by nesoy on 2017. 10. 26..
 */
public class Solution_1003 {
    static int cnt_zero = 0;
    static int cnt_one = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testcaseSize = scanner.nextInt();
        for (int i = 0; i < testcaseSize; i++) {
            cnt_zero = 0;
            cnt_one = 0;
            int value = scanner.nextInt();
            fibonacci(value);
            System.out.println(cnt_zero + " " + cnt_one);
        }

    }

    public static int fibonacci(int n) {
        if (n == 0) {
            cnt_zero++;
            return 0;
        } else if (n == 1) {
            cnt_one++;
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
