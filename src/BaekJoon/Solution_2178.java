package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

/**
 * Created by nesoy on 2017. 11. 22..
 * blog : https:nesoy.github.io
 * email : kyoje11@gmail.com
 */
public class Solution_2178 {

    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};

    public static void main(String[] args) throws IOException {

        int height = 0;
        int width = 0;

        char[][] map = new char[100][100];


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        height = Integer.parseInt(tokenizer.nextToken());
        width = Integer.parseInt(tokenizer.nextToken());

        for (int hIndex = 0; hIndex < height; hIndex++) {
            int wIndex = 0;
            for (char block : reader.readLine().toCharArray()) {
                map[hIndex][wIndex++] = block;
            }
        }

        System.out.println(bfs(map, height, width));
    }

    public static int bfs(char[][] map, int height, int width) {
        LinkedList<Point> queue = new LinkedList<>();
        Point startPoint = new Point();
        map[0][0] = '0';
        queue.offer(startPoint);

        while (!queue.isEmpty()) {
            Point point = queue.poll();

            if (point.x == height - 1 && point.y == width - 1) { // 도착
                return point.distance;
            }

            for (int i = 0; i < dx.length; i++) { //Queue 처리
                int newX = point.x + dx[i];
                int newY = point.y + dy[i];
                if (newX < height && newX >= 0 && newY < width && newY >= 0) {
                    if (map[newX][newY] == '1') {
                        Point newPoint = new Point();
                        newPoint.x = newX;
                        newPoint.y = newY;
                        newPoint.distance = point.distance + 1;
                        map[newX][newY] = '0'; // 방문
                        queue.offer(newPoint);
                    }
                }
            }
        }
        return 0;
    }
}

class Point {
    int x = 0;
    int y = 0;
    int distance = 1;
}
