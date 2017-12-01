package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * Created by nesoy on 2017. 11. 23..
 * blog : https:nesoy.github.io
 * email : kyoje11@gmail.com
 * 다익스트라
 */
public class Solution_1753 {
    static final int MAX = 100;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] token = reader.readLine().split(" ");

        int pointSize = Integer.parseInt(token[0]);
        int edgeSize = Integer.parseInt(token[1]);
        int startIndex = Integer.parseInt(reader.readLine());

        int[] distance = new int[20001];
        boolean[] visited = new boolean[20001];
        HashMap<Integer, LinkedList<Node>> maps = new HashMap<>();

        for (int i = 1; i <= pointSize; i++) { // 정답배열 초기화
            distance[i] = MAX;
        }

        for (int i = 0; i < edgeSize; i++) {
            String[] edgeInfo = reader.readLine().split(" ");
            int start = Integer.parseInt(edgeInfo[0]);
            int end = Integer.parseInt(edgeInfo[1]);
            int weight = Integer.parseInt(edgeInfo[2]);


            if (!maps.containsKey(start))
                maps.put(start, new LinkedList<>());

            maps.get(start).add(new Node(start, end, weight));
        }


        distance[startIndex] = 0;

        for (int i = 0; i < pointSize; i++) {
            int u = find(distance, visited, pointSize);

            visited[u] = true;

            if (maps.containsKey(u)) {
                for (Node node : maps.get(u)) {
                    if (distance[node.start] != MAX && distance[u] + node.weight < distance[node.end])
                        distance[node.end] = distance[u] +  node.weight;
                }
            }
        }

        //result
        for (int i = 1; i <= pointSize; i++) {
            if (distance[i] != MAX)
                System.out.println(distance[i]);
            else {
                System.out.println("INF");
            }
        }
    }

    //ans 찾지않은 가장 적은 값 Index 찾아주기.
    static int find(int[] ans, boolean[] visited, int size) {
        int min = MAX;

        int minIndex = -1;
        for (int i = 1; i <= size; i++) {
            if (ans[i] <= min && !visited[i]) {
                minIndex = i;
                min = ans[i];
            }
        }
        return minIndex;
    }
}

class Node {
    int start = 0;
    int end = 0;
    int weight = 0;

    Node(int start, int end, int weight) {
        this.start = start;
        this.end = end;
        this.weight = weight;
    }
}
