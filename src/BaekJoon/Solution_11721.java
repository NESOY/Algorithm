package BaekJoon;

import java.util.Scanner;

/**
 * Created by nesoy on 2017. 10. 26..
 */
public class Solution_11721 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.next();
        for (int i = 0; i < inputString.length(); i++) {
            if (i % 10 == 0 && i != 0) {
                System.out.println();
            }
            System.out.print(inputString.charAt(i));

        }
    }
}
