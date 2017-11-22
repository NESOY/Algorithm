package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;

/**
 * Created by nesoy on 2017. 11. 22..
 * blog : https:nesoy.github.io
 * email : kyoje11@gmail.com
 */
public class Solution_2667 {
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};

    public static void main(String[] args) throws IOException {

        char[][] map = new char[25][25];
        ArrayList<Integer> ans = new ArrayList();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(reader.readLine());


        for (int hIndex = 0; hIndex < size; hIndex++) {
            int wIndex = 0;
            for (char block : reader.readLine().toCharArray()) {
                map[hIndex][wIndex++] = block;
            }
        }
        int ansCount = 0;

        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                if(map[i][j] == '1') {
                    int area = bfs(map, size, i, j);
                    ans.add(area);
                    ansCount++;
                }
            }
        }
        System.out.println(ansCount);
        ans.sort(Comparator.naturalOrder());
        for(int value : ans){
            System.out.println(value);
        }
    }

    public static int bfs(char[][] map, int size, int startX, int startY) {
        LinkedList<House> queue = new LinkedList<>();
        int count = 0;

        // 시작 지점 초기화
        map[startX][startY] = '0';
        queue.add(new House(startX, startY));

        while (!queue.isEmpty()) {
            count++;
            House house = queue.poll();
            for (int i = 0; i < 4; i++) {
                int newX = house.x + dx[i];
                int newY = house.y + dy[i];

                if (newX < size && newX >= 0 && newY < size && newY >= 0) { // 범위 안이면
                    if(map[newX][newY] == '1') {    // 갈 수 있으면
                        House newHouse = new House(newX, newY);
                        queue.add(newHouse);
                        map[newX][newY] = '0'; // 제거
                    }
                }
            }
        }
        return count;
    }
}

class House {
    int x = 0;
    int y = 0;

    House(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
