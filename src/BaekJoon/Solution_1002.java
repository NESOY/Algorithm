package BaekJoon;

import java.util.Scanner;

/**
 * Created by nesoy on 2017. 10. 27..
 */
public class Solution_1002 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int testSize = scan.nextInt();
        for (int i = 0; i < testSize; i++) {
            double x1 = scan.nextInt();
            double y1 = scan.nextInt();
            double r1 = scan.nextInt();
            double x2 = scan.nextInt();
            double y2 = scan.nextInt();
            double r2 = scan.nextInt();

            if (x1 == x2 && y1 == y2) { // 겹칠 경우
                if (r1 == r2)
                    System.out.println(-1);
                else {
                    System.out.println(0);
                }
            } else {
                double length = Math.sqrt(Math.pow(x1 - x2, 2.0) + Math.pow(y1 - y2, 2.0));

                if ((r1 + r2) > length && Math.abs(r1 - r2) < length)

                    System.out.println(2);

                else if ((r1 + r2) == length || Math.abs(r1 - r2) == length)

                    System.out.println(1);

                else

                    System.out.println(0);

            }
        }
    }
}