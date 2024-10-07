package baekjoon.bronze;

import java.util.Scanner;

public class B3_1267 {
    public static void main(String[] args) {
        int y = 0;
        int m = 0;
        Scanner sc = new Scanner(System.in);
        int call = sc.nextInt(); // 통화 횟수
        int [] call_time = new int[call]; //통화 횟수의 크기를 가지는 배열생성
        for(int i = 0; i< call_time.length; i++){
            call_time[i] = sc.nextInt();//배열에 통화시간 입력
        }
        for(int i=0;i<call_time.length;i++){
            int y_cnt=call_time[i]/30;//통화시간을 영식요금제로 나눈 몫을 카운트에 넣고
            if(call_time[i]>0){
                y_cnt++;//나머지가 있다면 카운트를 한번 더 센다
            }
            y+=y_cnt*10;//카운트값으로 통화 시간에 따른 영식요금을 산출해서 저장
        }
        for(int i=0;i<call_time.length;i++){
            int m_cnt=call_time[i]/60;//통화시간을 영식요금제로 나눈 몫을 카운트에 넣고
            if(call_time[i]>0){
                m_cnt++;//나머지가 있다면 카운트를 한번 더 센다
            }
            m+=m_cnt*15;//카운트값으로 통화 시간에 따른 영식요금을 산출해서 저장
        }
        if(y<m){
            System.out.println("Y"+" "+y);
        } else if (y>m) {
            System.out.println("M"+" "+m);
        } else if (y==m) {
            System.out.println("Y"+" "+"M"+" "+y);
        }

    }

}
