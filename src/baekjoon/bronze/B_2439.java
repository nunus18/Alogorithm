package baekjoon.bronze;

import java.util.Scanner;

public class B_2439 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        for(int i =0; i < input;i++){
                for(int j= input; j > i; j--){
                    System.out.print("*");
                }
            System.out.println();
        }

    }
}
