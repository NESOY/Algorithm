package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by nesoy on 2017. 11. 24..
 * blog : https:nesoy.github.io
 * email : kyoje11@gmail.com
 */
public class Solution_1654 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        int N = scanner.nextInt();

        int[] arr = new int[K];

        for (int i = 0; i < K; i++) {
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);
        // left = 1
        // mid = 가장 작은 값 중간
        // right = 가장 작은 값

        // 결과 : index 찾기.
        //비교할시 mid 값보다 구하고자 하는 값이 높으면 left를 mid+1로 만들어주고 낮으면 right를 mid-1로 만들어 줍니다.
        //left > right 가 될때까지 1~3번을 반복해서 구하고자 하는 값을 찾습니다.


        long left = 1;
        long right = arr[K - 1];
        while (right >= left) {
            long mid = (left + right) / 2;
            long sum = getCount(arr, mid);
            if (sum < N) {
                right = mid - 1;
            }
            if (sum >= N) {
                left = mid + 1;
            }
        }
        System.out.println(right);
    }

    static int getCount(int[] arr, long input) {
        int sum = 0;
        for (int value : arr) {
            sum += value / input;
        }
        return sum;
    }
}
