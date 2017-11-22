package BaekJoon;

import java.util.Scanner;

/**
 * Created by nesoy on 2017. 10. 29..
 */
public class Solution_8958 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test_size = scanner.nextInt();
        scanner.nextLine(); // Consume

        for (int i = 0; i < test_size; i++) {
            String test = scanner.nextLine();
            char[] testArray = test.toCharArray();
            int score = 1;
            int sum = 0;
            char preToken = ' ';
            for (char testToken : testArray) {
                if (testToken == 'O') {
                    if (testToken == preToken) {
                        score++;
                    }else{
                        score = 1;
                    }
                    sum += score;
                }
                preToken = testToken;
            }
            System.out.println(sum);
        }
    }
}
