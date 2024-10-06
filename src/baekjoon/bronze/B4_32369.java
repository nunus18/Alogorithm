package baekjoon.bronze;

import java.util.Scanner;

public class B4_32369 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int good = 1;
        int bad = 1;

        int date = sc.nextInt();
        int plus_good = sc.nextInt();
        int plus_bad = sc.nextInt();

        for(int i = 0; i < date; i++){

            good += plus_good;
            bad += plus_bad;

            if (good < bad) {
                int change = good;
                good = bad;
                bad = change;
            }
            if (good == bad) {
                bad--;
            }
        }
        System.out.println(good+" "+bad);

    }

}
