package BaekJoon;

import java.util.Scanner;

/**
 * Created by nesoy on 2017. 11. 17..
 * blog : https:nesoy.github.io
 * email : kyoje11@gmail.com
 */
public class Solution_11729 {
    static int count = 0;
    static StringBuilder builder = new StringBuilder();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size =scanner.nextInt();
        hanoi(size, 1, 2, 3);
        System.out.println(count);
        System.out.println(builder.substring(0,builder.lastIndexOf("\n")));
    }

    static void move(int from, int to, boolean checkFinal) {
        count++;
        builder.append(from + " " + to + "\n");
    }

    static void hanoi(int n, int from, int by, int to) {
        if (n == 1)
            move(from, to, true);
        else {
            hanoi(n - 1, from, to, by);
            move(from, to, false);
            hanoi(n - 1, by, from, to);
        }
    }
}
