package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by nesoy on 2017. 11. 22..
 * blog : https:nesoy.github.io
 * email : kyoje11@gmail.com
 */
public class Solution_1005 {
    static final int mapSize = 1000;
    static int[][] map;
    static int[] ans;
    static int[] realans;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int testSize = Integer.parseInt(reader.readLine());

        for (int i = 0; i < testSize; i++) {
            map = new int[mapSize + 1][mapSize + 1];
            ans = new int[mapSize + 1];
            realans = new int[mapSize + 1];
            String[] tokenList = reader.readLine().split(" "); // mapSize, ruleSize

            int mapSize = Integer.parseInt(tokenList[0]);
            int ruleSize = Integer.parseInt(tokenList[1]);



            String[] valueList = reader.readLine().split(" "); // values
            int index = 1;
            for (String value : valueList) {
                int number = Integer.parseInt(value);
                ans[index] = number;
                index++;
            }


            //rule
            for (int j = 0; j < ruleSize; j++) {
                StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
                int end = Integer.parseInt(tokenizer.nextToken());
                int start = Integer.parseInt(tokenizer.nextToken());
                map[start][end] = 1;
            }



            int endIndex = Integer.parseInt(reader.readLine());

            System.out.println(solve(endIndex, mapSize));

        }

    }
    static int solve(int W, int N) {
        if (realans[W] > 0) return realans[W];

        int result = 0;
        for (int i = 1; i <= N; i++) {
            if (map[W][i] == 1) {
                result = Math.max(result, solve(i, N));
            }
        }
        return realans[W] = result + ans[W];
    }

}
