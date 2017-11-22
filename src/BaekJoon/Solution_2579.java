package BaekJoon;

import java.util.Scanner;

/**
 * Created by nesoy on 2017. 10. 27..
 */
public class Solution_2579 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] stairList = new int[300];
        int[][] scoreList = new int[300][2];
        int size = scan.nextInt();
        for (int i = 0; i < size; i++) {
            stairList[i] = scan.nextInt();
        }
        scoreList[0][0] = stairList[0];
        scoreList[1][0] = scoreList[0][0] + stairList[1];
        scoreList[1][1] = scoreList[0][1] + stairList[1];


        for (int i = 2; i < size; i++) {
            scoreList[i][0] = scoreList[i - 1][1] + stairList[i];
            scoreList[i][1] = Math.max(scoreList[i - 2][0],scoreList[i - 2][1]) + stairList[i];
        }
        System.out.println(Math.max(scoreList[size - 1][0],scoreList[size - 1][1]));

    }
}
