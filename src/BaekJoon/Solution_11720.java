package BaekJoon;

import java.util.Scanner;

/**
 * Created by nesoy on 2017. 10. 26..
 */
public class Solution_11720 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        String valueList = scanner.next();
        System.out.println(getSum(size, valueList));
    }

    public static int getSum(int size, String value) {
        int sum = 0;
        char[] valueList = value.toCharArray();
        for (char charValue : valueList) {
            sum += charValue - '0';
        }

        return sum;
    }
}
