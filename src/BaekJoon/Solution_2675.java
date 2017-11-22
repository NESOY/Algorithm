package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by nesoy on 2017. 11. 22..
 * blog : https:nesoy.github.io
 * email : kyoje11@gmail.com
 * https://www.acmicpc.net/problem/2675
 */
/*
문자열 S를 입력받은 후에, 각 문자를 R번 반복해 새 문자열 T를 만든 후 출력하는 프로그램을 작성하시오.

다시 설명하자면, 첫 번째 문자를 R번 반복하고, 두 번째 문자를 R번 반복하는 식으로 T를 만들면 된다. S에는 QR Code "alphanumeric" 문자만 들어있다.

QR Code "alphanumeric" 문자는 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ$%*+-./: 이다.
 */
public class Solution_2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int testSize = Integer.parseInt(reader.readLine());
        for (int i = 0; i < testSize; i++) {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            int repeatSize = Integer.parseInt(tokenizer.nextToken());
            String inputString = tokenizer.nextToken();
            for(char token : inputString.toCharArray()){
                for(int j=0; j<repeatSize; j++) {
                    System.out.print(token);
                }
            }
            System.out.println();
        }

    }
}
