package BaekJoon;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by nesoy on 2017. 11. 16..
 * blog : https:nesoy.github.io
 * email : kyoje11@gmail.com
 */
public class Solution_7576 {
    private static int zeroCnt = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = scanner.nextInt();
        int height = scanner.nextInt();
        int[][] map = new int[height][width];

        Queue queue = new LinkedList();

        // update map
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                map[i][j] = scanner.nextInt();
                if (map[i][j] == 1) {
                    queue.offer(new Code(i, j, 0));
                }else if(map[i][j] == 0){
                    zeroCnt++;
                }
            }
        }

        int day = 0;
        while (!queue.isEmpty()) {
            Code code = (Code) queue.poll();
            riping(code.x, code.y, height, width, map, queue, code.days);
            day = code.days;
        }
        if(zeroCnt == 0)
            System.out.println(day);
        else{
            System.out.println(-1);
        }
    }

    public static void showMap(int height, int width, int[][] map) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static int riping(int x, int y, int height, int width, int[][] map, Queue queue, int days) {
        int count = 0;
        if (x > 0 && map[x - 1][y] == 0) { // 위
            map[x - 1][y] = days+1;
            zeroCnt--;
            queue.offer(new Code(x - 1, y, days+1));
            count++;
        }
        if (x < height - 1 && map[x + 1][y] == 0) { // 아래
            map[x + 1][y] = days+1;
            zeroCnt--;
            queue.offer(new Code(x + 1, y, days+1));
            count++;
        }
        if (y > 0 && map[x][y - 1] == 0) { // 왼쪽
            map[x][y - 1] = days+1;
            zeroCnt--;
            queue.offer(new Code(x, y - 1, days+1));
            count++;
        }
        if (y < width - 1 && map[x][y + 1] == 0) { // 오른쪽
            map[x][y + 1] = days+1;
            zeroCnt--;
            queue.offer(new Code(x, y + 1, days+1));
            count++;
        }
        return count;
    }
}

class Code {
    int x;
    int y;
    int days;
    Code(int x, int y, int days) {
        this.x = x;
        this.y = y;
        this.days = days;
    }
}