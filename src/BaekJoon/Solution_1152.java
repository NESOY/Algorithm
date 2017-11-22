package BaekJoon;

import java.util.Scanner;

/**
 * Created by nesoy on 2017. 10. 27..
 */
public class Solution_1152 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        String[] wordList = sentence.split(" ");
        int cnt = 0;
        for(String word : wordList){
            if(!word.equals("")){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
