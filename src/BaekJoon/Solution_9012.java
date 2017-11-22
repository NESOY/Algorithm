package BaekJoon;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by nesoy on 2017. 11. 16..
 * blog : https:nesoy.github.io
 * email : kyoje11@gmail.com
 */
public class Solution_9012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();

        scanner.nextLine();
        for (int i = 0; i < size; i++) {

            String tokenList = scanner.nextLine();
            Stack<Character> stack = new Stack<>();
            for (char token : tokenList.toCharArray()) {
                if (token == '(') { // push item
                    stack.push(token);
                }
                if (token == ')') { // check item
                    if(stack.isEmpty() || stack.peek() != '('){
                        stack.push(token);
                        break;
                    }else{
                        stack.pop();
                    }
                }
            }
            if(!stack.isEmpty()){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
        }

    }
}
