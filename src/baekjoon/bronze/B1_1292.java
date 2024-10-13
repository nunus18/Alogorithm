package baekjoon.bronze;

import java.util.Scanner;

public class B1_1292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str ="";
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int i =0;
        int n =1;
        int sum =0;
        while(i<n2){
            for(int j = 0; j<n; j++){
                str=str+n+" ";
                i++;
            }
            n++;
        }
        String [] str1 = str.split(" ");
        for(int m = n1-1 ; m<n2 ;m++){
            sum+=Integer.parseInt(str1[m]);
        }
        System.out.println(sum);
    }
}
