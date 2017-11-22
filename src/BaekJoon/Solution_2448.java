package BaekJoon;

/**
 * Created by nesoy on 2017. 10. 29..
 */
public class Solution_2448 {
    public static void main(String[] args) {
        int size = 6;
        printTriangle(size);
    }

    public static void printTriangle(int size) {
        int index = 0;
        int cnt = 0;
        int index_size = 3;
        for (int i = 0; i < size; i++) {
            for (int space = i + 1; space < size; space++) {// 앞 여백 찍기
                System.out.print("_");
            }
            switch (index) {
                case 0: // 1층
                    System.out.print("*");
                    if(cnt>0) {
                        for (int space = size-1; space > 0; space--) {// 여백 찍기
                            System.out.print("_");
                        }
                        System.out.print("*");
                    }
                    break;
                case 1: // 2층
                    System.out.print("*");
                    System.out.print("_");
                    System.out.print("*");
                    if(cnt>0) {
                        for (int space = size-3; space > 0; space--) {// 여백 찍기
                            System.out.print("_");
                        }
                        System.out.print("*");
                        System.out.print("_");
                        System.out.print("*");
                    }
                    break;
                case 2: // 3층
                    System.out.print("*");
                    System.out.print("*");
                    System.out.print("*");
                    System.out.print("*");
                    System.out.print("*");
                    if(cnt>0) {
                        for (int space = size-5; space > 0; space--) {// 여백 찍기
                            System.out.print("_");
                        }
                        System.out.print("*");
                        System.out.print("*");
                        System.out.print("*");
                        System.out.print("*");
                        System.out.print("*");
                    }
                    cnt++;
                    break;
            }

            index = (index + 1) % index_size;
            System.out.println();
        }
    }
}
