package BaekJoon;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by nesoy on 2017. 11. 16..
 * blog : https:nesoy.github.io
 * email : kyoje11@gmail.com
 */
public class Solution_1874 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];

        int cnt = 1;
        StringBuilder answer = new StringBuilder();

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
            while (cnt <= array[i]) { // Making
                stack.push(cnt++);
                answer.append("+\n");
            }
            if (stack.peek() == array[i]) {
                stack.pop();
                answer.append("-\n");
            } else {
                break;
            }
        }

        if(stack.isEmpty()){
            System.out.print(answer);
        }else{
            System.out.print("NO");
        }
    }
}
