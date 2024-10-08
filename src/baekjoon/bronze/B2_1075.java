package baekjoon.bronze;

import java.util.Scanner;

public class B2_1075 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f = sc.nextInt();
        int m = n/100;
        m*=100; //입력받은 정수의 백의 자릿수 밑을 00으로 초기화
        int mm = m;
        boolean b = true;
        while (b) {
            if (m % f != 0) {
                m++;//00부터 1씩 더하면서 나누어 떨어지는 최솟값 체크
            } else {
                b = false;
            }
        }
        if(m-mm<10) {
            System.out.println("0"+(m-mm));
        }else {
            System.out.println(m - mm);
        }
    }
}