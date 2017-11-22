package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by nesoy on 2017. 11. 22..
 * blog : https:nesoy.github.io
 * email : kyoje11@gmail.com
 * 소수(素數, 발음: 소쑤, 문화어: 씨수, 영어: prime number)는 양의 약수가 1과 자기 자신 뿐인 1보다 큰 자연수로 정의된다.
 */

public class Solution_1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int testSize = Integer.parseInt(reader.readLine());

        StringTokenizer tokenList = new StringTokenizer(reader.readLine());
        int count = 0;
        while (tokenList.hasMoreTokens()) {
            int number = Integer.parseInt(tokenList.nextToken());
            if(isPrime(number)){
                count++;
            }
        }
        System.out.println(count);

    }

    public static boolean isPrime(int number) {
        if (number == 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}