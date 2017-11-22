package BaekJoon;

import java.util.Scanner;

/**
 * Created by nesoy on 2017. 10. 29..
 */
public class Solution_2920 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int preNumber = 0;
        int number = 0;
        int gap = 0;
        boolean[] flag = new boolean[3];
        for (int i = 0; i < 8; i++) {
            number = scanner.nextInt();

            gap = preNumber - number;

            switch (gap) {
                case -1:
                    flag[0] = true;
                    break;
                case 1:
                    flag[1] = true;
                    break;
                default:
                    if (preNumber != 0) {
                        flag[2] = true;
                    }
                    break;
            }
            preNumber = number;
        }
        if (flag[2] == true) {
            System.out.println("mixed");
        } else {
            if (flag[0] == true) {
                System.out.println("ascending");
            } else {
                System.out.println("descending");
            }
        }
    }
}
