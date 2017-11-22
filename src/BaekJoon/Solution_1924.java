package BaekJoon;

import java.util.Scanner;

/**
 * Created by nesoy on 2017. 10. 26..
 */
// 오늘은 2007년 1월 1일 월요일이다. 그렇다면 2007년 x월 y일은 무슨 요일일까? 이를 알아내는 프로그램을 작성하시오.
//첫째 줄에 빈 칸을 사이에 두고 x(1≤x≤12)와 y(1≤y≤31)이 주어진다.
//참고로 2007년에는 1, 3, 5, 7, 8, 10, 12월은 31일까지, 4, 6, 9, 11월은 30일까지, 2월은 28일까지 있다.

//첫째 줄에 x월 y일이 무슨 요일인지에 따라 SUN, MON, TUE, WED, THU, FRI, SAT중 하나를 출력한다.
public class Solution_1924 {
    private static String[] dayList = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};

    private static int[] day31List = {1, 3, 5, 7, 8, 10, 12};
    private static int[] day30List = {4, 6, 9, 11};
    private static int[] day28List = {2};

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int month = scan.nextInt();
        int day = scan.nextInt();

        System.out.println(getDay(month, day));
    }
    public static String getDay(int month, int day) {
        int dayIndex;
        int daySize = day;
        for(int i=1; i<month; i++){
            int monthSize = getMonthSize(i);
            daySize+= monthSize;
        }
        dayIndex = daySize % dayList.length;

        return dayList[dayIndex];
    }

    public static int getMonthSize(int month) {
        for (int month_31 : day31List) {
            if (month == month_31)
                return 31;
        }
        for (int month_30 : day30List) {
            if (month == month_30)
                return 30;
        }
        for (int month_28 : day28List) {
            if (month == month_28)
                return 28;
        }
        return -1;
    }
}
