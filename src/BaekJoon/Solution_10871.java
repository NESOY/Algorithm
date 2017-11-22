package BaekJoon;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by nesoy on 2017. 10. 26..
 */
public class Solution_10871 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int maxSize = scanner.nextInt();

        ArrayList<Integer> list = new ArrayList<>();


        for (int i = 0; i < size; i++) {
            int value = scanner.nextInt();
            if (value < maxSize)
                list.add(value);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if (i != list.size() - 1)
                System.out.print(" ");
        }
    }
}
