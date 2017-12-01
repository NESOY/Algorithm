package BaekJoon;

import java.util.Scanner;

/**
 * Created by nesoy on 2017. 11. 24..
 * blog : https:nesoy.github.io
 * email : kyoje11@gmail.com
 */
public class Solution_2908 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String value = scanner.next();
        String value2 = scanner.next();

        StringBuilder builder = new StringBuilder();
        StringBuilder builder2 = new StringBuilder();

        char[] arr = value.toCharArray();
        char[] arr2 = value2.toCharArray();

        for(int i=value.length()-1; i>=0; i--){
            builder.append(arr[i]);
            builder2.append(arr2[i]);
        }

        System.out.println(Math.max(Integer.parseInt(builder.toString()),Integer.parseInt(builder2.toString())));
    }
}
