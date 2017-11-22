package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * Created by nesoy on 2017. 11. 18..
 * blog : https:nesoy.github.io
 * email : kyoje11@gmail.com
 */
public class Solution_1920 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int mapSize = Integer.parseInt(reader.readLine());
        int[] map = new int[mapSize];
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        int index = 0;

        while (tokenizer.hasMoreTokens()) {
            map[index++] = Integer.parseInt(tokenizer.nextToken());
        }

        Arrays.sort(map); // binarySearch를 사용하기 위해 정렬

        reader.readLine(); // 제거
        tokenizer = new StringTokenizer(reader.readLine());
        while (tokenizer.hasMoreTokens()) {
            int key = Integer.parseInt(tokenizer.nextToken());
            if (Arrays.binarySearch(map, key) < 0) {
                System.out.println(0);
            } else {
                System.out.println(1);
            }

        }
    }
}
