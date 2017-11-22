package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by nesoy on 2017. 11. 22..
 * blog : https:nesoy.github.io
 * email : kyoje11@gmail.com
 * https://www.acmicpc.net/problem/1157
 */
public class Solution_1157 {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] ans = new int[26];
        int[] cnt = new int[26];

        String inputString = reader.readLine().toLowerCase();
        for(char token : inputString.toCharArray()){
            ans[token-'a']++;
            cnt[token-'a']++;
        }

        Arrays.sort(cnt);
        if(cnt[25] == cnt[24]){
            System.out.println("?");
        }else{
            for(int index = 0; index < ans.length; index++){
                if(cnt[25] == ans[index]){
                    System.out.println((char)('A'+index));
                }
            }
        }
    }
}
