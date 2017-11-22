package BaekJoon;

import java.util.Scanner;

/**
 * Created by nesoy on 2017. 11. 1..
 */
public class Solution_10809 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] array = new int[26];
        String input = scan.next();

        for(int i=0; i<array.length; i++){
            array[i] = input.indexOf('a'+i);
            System.out.print(array[i] + " ");
        }
    }
}
