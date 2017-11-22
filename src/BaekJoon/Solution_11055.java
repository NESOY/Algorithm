package BaekJoon;

import java.util.Scanner;

/**
 * Created by nesoy on 2017. 11. 18..
 * blog : https:nesoy.github.io
 * email : kyoje11@gmail.com
 */
public class Solution_11055 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] map = new int[size];
        int[] ans = new int[size];
        //map 정의
        for (int i = 0; i < size; i++) {
            map[i] = scanner.nextInt();
        }
        //다이나믹
        int best = 0;
        for (int i = size - 1; i >= 0; i--) {
            ans[i] += map[i];
            int max = 0;
            for (int j = i; j < size; j++) {
                if(map[i] < map[j]) {
                    max = Math.max(max, ans[j]);
                }
            }
            ans[i] += max;
            best = Math.max(best,ans[i]);
        }
        System.out.println(best);
    }
}
