package baekjoon.bronze;

import java.util.Scanner;

public class B1_1037 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = sc.nextInt();
        int min = max;
        for(int i = 0;i<n-1;i++){
            int insert = sc.nextInt();
            if(max<insert){
                max=insert;
            }
            if(min>insert) {
                min = insert;
            }
        }
        System.out.println(min*max);

    }
}
