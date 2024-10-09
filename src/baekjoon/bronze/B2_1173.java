package baekjoon.bronze;

import java.util.Scanner;

public class B2_1173 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min = sc.nextInt();
        int max = sc.nextInt();
        int t = sc.nextInt();
        int r = sc.nextInt();
        int x = min;
        int r_cnt=0;

        for(int i = 0; i < n; i++){
           if(x==max){
               x-=r;
               if(x<min){
                   x=min;
               }
               r_cnt++;
           }
           while(x+t>max){
               x-=r;
               r_cnt++;
           }
            if(x<min){
                x=min;
            }
            x+=t;
       }
        if(max-min<t){
            System.out.println("-1");
        }else{
            System.out.println(r_cnt + n);
        }
    }
}
