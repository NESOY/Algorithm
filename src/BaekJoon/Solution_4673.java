package BaekJoon;

import java.util.ArrayList;

/**
 * Created by nesoy on 2017. 10. 26..
 */
public class Solution_4673 {
    public static void main(String[] args){
        int size = 10000;
        boolean[] flag = new boolean[size+1];
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1; i<size; i++){
            // check flag
            int index = getNum(i);
            if(index < size) {
                flag[index] = true;
            }
            if(!flag[i]){
                list.add(i);
            }
        }
        for(Integer value : list){
            System.out.println(value);
        }
    }
    public static int getNum(int value){
        char[] array = String.valueOf(value).toCharArray();
        int sum = value;
        for(char charValue : array){
            sum+= charValue - '0';
        }
        return sum;
    }
}
