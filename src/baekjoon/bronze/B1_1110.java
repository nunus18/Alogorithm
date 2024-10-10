package baekjoon.bronze;

import java.util.Scanner;

public class B1_1110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_origin = sc.nextInt();
        int num = num_origin;
        boolean tf = true;
        int cnt = 0;
        if(num_origin<10 && num_origin>0){
            num=num_origin*10+num_origin;
            cnt++;
        }
        while(tf){
            int f = num/10;
            int b = num%10;
            num = b*10+(f+b)%10;
            cnt++;
            if(num==num_origin){
                tf=false;
            }
        }
        System.out.println(cnt);
    }
}
