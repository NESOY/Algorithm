package BaekJoon;

import java.util.Scanner;

/**
 * Created by nesoy on 2017. 10. 26.. success
 */
public class Solution_2440 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        for(int i=0; i<size; i++){
            String output = "*";
            for(int j=0; j<size-i-1; j++)
                output += "*";
            System.out.println(output);
        }

    }
}
