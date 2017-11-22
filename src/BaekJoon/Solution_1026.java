package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by nesoy on 2017. 11. 1..
 */
public class Solution_1026 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        int[] array2 = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < size; i++) {
            array2[i] = scanner.nextInt();
        }
        Arrays.sort(array);
        Arrays.sort(array2);
        int sum = 0;
        for(int i=0; i<size; i++){
            sum += array[i] * array2[size-i-1];
        }
        System.out.println(sum);

    }
}
