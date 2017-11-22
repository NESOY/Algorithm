package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by nesoy on 2017. 10. 26..
 */
public class Solution_10817 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] list = new int[3];
        int index = 0;
        while(scanner.hasNext()){
            list[index++] = scanner.nextInt();
        }
        Arrays.sort(list);
        System.out.println(list[1]);
    }
}
