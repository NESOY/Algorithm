package BaekJoon;

import java.util.Scanner;

/**
 * Created by nesoy on 2017. 10. 29..
 */
public class Solution_10039 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for(int i=0; i<5; i++){
            int score = scanner.nextInt();
            sum += score < 40 ? 40 : score;

        }
        System.out.println(sum/5);

    }
}
