package BaekJoon;

import java.util.Scanner;

/**
 * Created by nesoy on 2017. 10. 26.. success
 */

public class Solution_2839 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        System.out.println(getCount(size));

    }

    public static int getCount(int size) {
        int cnt_5 = 0;
        int cnt_3 = 0;
        cnt_5 = size / 5;   // 5의 최대 개수
        cnt_3 = (size - (cnt_5 * 5)) / 3; // 3의 최대 개수 : 0, 1

        while (cnt_5 >= 0) {
            if (size == cnt_5 * 5 + cnt_3 * 3) {    // size가 맞는 경우
                return cnt_3 + cnt_5;
            } else { // size가 안맞는 경우
                cnt_5--;
                cnt_3 = (size - (cnt_5 * 5)) / 3; // 3의 최대 개수
            }
        }
        return -1;
    }
}
