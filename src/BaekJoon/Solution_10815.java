package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by nesoy on 2017. 11. 24..
 * blog : https:nesoy.github.io
 * email : kyoje11@gmail.com
 */
public class Solution_10815 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] N_map = new int[N];
        for (int i = 0; i < N; i++) {
            N_map[i] = scanner.nextInt();
        }


        int M = scanner.nextInt();
        int[] M_map = new int[M];
        int[] ans = new int[M];
        for (int i = 0; i < M; i++) {
            M_map[i] = scanner.nextInt();
        }

        Arrays.sort(N_map);
        for (int i = 0; i < M; i++) {
            if (checkMap(N_map, N, M_map[i])) {
                System.out.print(1 + " ");
            }else {
                System.out.print(0 + " ");
            }
        }
    }

    static boolean checkMap(int[] map, int size, int value) {
        int left = 0;
        int right = size - 1;

        while (right >= left) {
            int mid = (left + right) / 2;
            if (map[mid] > value) { // 중간값보다 작은 경우
                right = mid - 1;
            }
            if (map[mid] < value) { // 중간값보다 큰 경우
                left = mid + 1;
            }
            if(map[mid] == value){
                return true;
            }
        }
        return false;
    }

}
