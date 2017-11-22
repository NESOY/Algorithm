package BaekJoon;

import java.util.Scanner;

/**
 * Created by nesoy on 2017. 10. 26..
 */

//모든 이웃은 같은 색으로 칠할 수 없다는 규칙도 정했다.
//집 i의 이웃은 집 i-1과 집 i+1이다.
//처음 집과 마지막 집은 이웃이 아니다.

//빨강으로 칠할 때 드는 비용, 초록으로 칠할 때 드는 비용, 파랑으로 드는 비용이 주어질 때, 모든 집을 칠할 때 드는 비용의 최솟값을 구하는 프로그램을 작성하시오.
public class Solution_1149 {
    private static final int RGB_SIZE = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[][] expenseArray = new int[size+1][RGB_SIZE];
        int[][] Array = new int[size+1][RGB_SIZE];

        for (int i = 1; i <= size; i++) {
            for (int j = 0; j < RGB_SIZE; j++) {
                expenseArray[i][j] = scanner.nextInt();
            }
        }

        System.out.println(getMinExpense(size, expenseArray, Array));
    }

    public static int getMinExpense(int size, int[][] expenseArray, int[][] Array) {
        for (int i = 1; i <= size; i++) {
                Array[i][0] = Math.min(Array[i - 1][1], Array[i - 1][2]) + expenseArray[i][0];
                Array[i][1] = Math.min(Array[i - 1][0], Array[i - 1][2]) + expenseArray[i][1];
                Array[i][2] = Math.min(Array[i - 1][0], Array[i - 1][1]) + expenseArray[i][2];
        }

        return Math.min(Math.min(Array[size][0],Array[size][1]),Array[size][2]);
    }
}
