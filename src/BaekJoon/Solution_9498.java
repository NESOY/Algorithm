package BaekJoon;

import java.util.Scanner;

/**
 * Created by nesoy on 2017. 10. 26..
 */
public class Solution_9498 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();
        System.out.println(getRank(score));
    }

    public static String getRank(int score) {
        switch (score / 10) {
            case 10:
            case 9:
                return "A";
            case 8:
                return "B";
            case 7:
                return "C";
            case 6:
                return "D";
            default:
                return "F";
        }
    }
}
