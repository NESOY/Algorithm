package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by nesoy on 2017. 11. 23..
 * blog : https:nesoy.github.io
 * email : kyoje11@gmail.com
 */
public class Solution_1504 {
    static final int MAX = 200000001;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //정점의 개수 N과 간선의 개수 E
        String[] token = reader.readLine().split(" ");
        int pointSize = Integer.parseInt(token[0]);
        int edgeSize = Integer.parseInt(token[1]);

        //map init
        int[][] map = new int[pointSize][pointSize];
        for (int i = 0; i < pointSize; i++) {
            Arrays.fill(map[i], MAX);
        }

        //E개의 줄에 걸쳐서 세 개의 정수 a, b, c
        for (int i = 0; i < edgeSize; i++) {
            String[] edgeInfo = reader.readLine().split(" ");
            int start = Integer.parseInt(edgeInfo[0]);
            int end = Integer.parseInt(edgeInfo[1]);
            int weight = Integer.parseInt(edgeInfo[2]);
            //무방향
            map[start - 1][end - 1] = weight;
            map[end - 1][start - 1] = weight;
        }

        //모든 구간 최단거리 구함
        floyd(pointSize, map);

        // 방문 조건 정점
        //2 3
        String[] visitPoint = reader.readLine().split(" ");
        int visitIndex1 = Integer.parseInt(visitPoint[0]) - 1;
        int visitIndex2 = Integer.parseInt(visitPoint[1]) - 1;

        map[visitIndex1][visitIndex1] = 0;
        map[visitIndex2][visitIndex2] = 0;

        // 경로의 작은 값 찾기
        int sum = Math.min(
                map[0][visitIndex1] + map[visitIndex1][visitIndex2] + map[visitIndex2][pointSize - 1],
                map[0][visitIndex2] + map[visitIndex2][visitIndex1] + map[visitIndex1][pointSize - 1]);
        if(sum >= MAX){
            System.out.println(-1);
        }else {
            System.out.println(sum);
        }
    }

    static void floyd(int pointSize, int[][] map) {
        for (int k = 0; k < pointSize; k++) {
            for (int i = 0; i < pointSize; i++) {
                for (int j = 0; j < pointSize; j++) {
                    if (map[i][k] + map[k][j] < map[i][j]) {
                        map[i][j] = map[i][k] + map[k][j];
                    }
                }
            }
        }
    }
}
