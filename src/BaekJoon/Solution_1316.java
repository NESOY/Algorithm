package BaekJoon;

import java.util.Scanner;

/**
 * Created by nesoy on 2017. 11. 24..
 * blog : https:nesoy.github.io
 * email : kyoje11@gmail.com
 */
public class Solution_1316 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int count = 0;
        for (int i = 0; i < size; i++) {
            int[] ans = new int[26];
            String input = scanner.next();
            boolean fail = false;
            char preChar = '.';
            for (char value : input.toCharArray()) {
                if (ans[value - 'a'] == 1) { // 이미 있는 경우
                    if (preChar != value) { // 이전꺼랑 같지 경우 실패
                        fail = true;
                        break;
                    }
                } else { // 처음 등장 단어
                    ans[value - 'a'] = 1;
                }
                preChar = value;
            }
            if (!fail) {
                count++;
            }
        }
        System.out.println(count);
    }
}
