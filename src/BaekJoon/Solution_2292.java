package BaekJoon;

import java.util.Scanner;

/**
 * Created by nesoy on 2017. 10. 29..
 */
public class Solution_2292 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextInt();
        int maxIndex = 1;
        int answer = 1;
        int gap = 6;
        while (true) {
            if (index <= maxIndex) {
                break;
            }
            maxIndex = maxIndex + gap * answer;
            answer++;
        }
        System.out.println(answer);
    }
}
