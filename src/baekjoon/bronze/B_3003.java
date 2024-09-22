package baekjoon.bronze;

import java.util.Scanner;

public class B_3003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] insert = new int[6];
        int[] result = new int[]{1, 1, 2, 2, 2, 8};
        for(int i =0; i < insert.length; i++){
            insert[i] = sc.nextInt();
        }
        for (int i = 0; i < insert.length; i++) {
            System.out.print(result[i]-insert[i] + " ");
        }
    }

}
