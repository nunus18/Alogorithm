package baekjoon.bronze;

import java.util.Scanner;

public class B1_1834 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long sum =0;
        for(int i = 1; i< n; i++){
            sum+=n*i+i;
        }
        System.out.println(sum);
    }
}
