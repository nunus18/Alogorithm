package baekjoon.bronze;

import java.util.Scanner;

public class B3_1085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();
        int a = w-x;
        int b = h-y;

        System.out.println(Math.min(Math.min(Math.abs(a), x), Math.min(Math.abs(b), y)));

//
//        if(a<0){
//            a *= (-1);
//        }
//        if(b<0){
//            b *= (-1);
//        }
//        if(a>x){
//            a=x;
//        }
//        if(b>y){
//            b=y;
//        }
//        if(a < b){
//            System.out.println(a);
//        }else{
//            System.out.println(b);
//        }
    }
}
