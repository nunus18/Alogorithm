package baekjoon.bronze;

import java.util.Scanner;

public class B2_1434 {
    //쓰레기 브5수준
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int box = sc.nextInt();
        int book = sc.nextInt();
        int a = 0;
        int b = 0;
        for(int i = 0; i < box; i++){
            a += sc.nextInt();
        }
        for(int i = 0; i < book; i++){
            b += sc.nextInt();
        }
        System.out.println(a-b);

    }
}
