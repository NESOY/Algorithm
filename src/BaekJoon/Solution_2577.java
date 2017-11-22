package BaekJoon;

import java.util.Scanner;

/**
 * Created by nesoy on 2017. 10. 29..
 */
public class Solution_2577 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int sum = a * b * c;
        String sumString = String.valueOf(sum);
        int[] array = new int[10];
        for(char token : sumString.toCharArray()){
            array[token-'0']++;
        }
        for(int answer : array){
            System.out.println(answer);
        }
    }
}
