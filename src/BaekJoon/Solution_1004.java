package BaekJoon;

import java.util.Scanner;

/**
 * Created by nesoy on 2017. 11. 1..
 */
public class Solution_1004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test_size = scanner.nextInt();
        for (int i = 0; i < test_size; i++) {
            int startX = scanner.nextInt();
            int startY = scanner.nextInt();
            int endX = scanner.nextInt();
            int endY = scanner.nextInt();
            int circle_size = scanner.nextInt();
            int cnt = 0;
            for (int j = 0; j < circle_size; j++) {
                int circleX = scanner.nextInt();
                int circleY = scanner.nextInt();
                int radius = scanner.nextInt();

                if (isInCircle(circleX, circleY, radius, startX, startY) && !isInCircle(circleX, circleY, radius, endX, endY)) {
                    cnt++;
                }
                if (!isInCircle(circleX, circleY, radius, startX, startY) && isInCircle(circleX, circleY, radius, endX, endY)) {
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
    }

    public static boolean isInCircle(int circleX, int circleY, int radius, int x, int y) {
        return Math.pow((x - circleX), 2) + Math.pow((y - circleY), 2) <= Math.pow(radius, 2);
    }
}
