package BaekJoon;

import java.util.Scanner;

/**
 * Created by nesoy on 2017. 10. 26..
 */
public class Solution_4344 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int testcase_size = scan.nextInt();
        for (int i = 0; i < testcase_size; i++) {
            int score_size = scan.nextInt();
            double sum = 0;
            int[] score_list = new int[score_size];

            for (int j = 0; j < score_size; j++) {
                score_list[j] = scan.nextInt();
                sum += score_list[j];
            }

            double avg = sum / score_size;
            double cnt_winner = 0;
            for(int score : score_list){
                if(score > avg)
                    cnt_winner++;
            }

            System.out.println(String.format("%.3f",cnt_winner/score_size*100) +"%");
        }


    }
}
