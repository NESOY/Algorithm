package BaekJoon;

import java.util.Scanner;

/**
 * Created by nesoy on 2017. 10. 26..
 */
public class Solution_1932 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[][] array = new int[500][500];
        int[][] scoreArray = new int[500][500];
        // Get Info
        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= i; j++) {
                array[i][j] = scan.nextInt();
            }
        }
        scoreArray[0][0] = array[0][0];

        // Calculate
        for (int i = 1; i < size; i++) {
            for (int j = 0; j <= i; j++) {

                if (j == 0) {//처음
                    scoreArray[i][j] = scoreArray[i-1][j] + array[i][j];
                } else if (j == i) {//끝
                    scoreArray[i][j] = scoreArray[i-1][j-1] + array[i][j];
                } else {
                    int left = scoreArray[i-1][j-1] + array[i][j];
                    int right = scoreArray[i-1][j] + array[i][j];
                    scoreArray[i][j] = Math.max(left, right);
                }
            }
        }
        int max = 0;
        for(int i=0; i<size; i++){
            max = Math.max(max, scoreArray[size-1][i]);
        }
        System.out.println(max);

    }
}
