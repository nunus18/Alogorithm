package baekjoon.bronze;

import javax.net.ssl.SSLContextSpi;
import java.util.Scanner;

public class B_18108 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int rest = 2541-1998;
        int answer = input-rest;
        System.out.println(answer);
    }

}
