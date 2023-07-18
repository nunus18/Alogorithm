package baekjoon.bronze;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class B_2480 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("입력하소 반복 얼마나 할지");
        int input = sc.nextInt();

        List<Integer> inputList = new ArrayList<>();
        int[] inputArrays = new int[input];

        for (int i = 0; i < input; i++) {
            int nextInt = sc.nextInt();
            inputList.add(nextInt);
            inputArrays[i] = nextInt;
        }

        for (int i = 0; i < inputList.size(); i++) {
            System.out.println(inputList.get(i));
        }

        for (int i = 0; i < inputArrays.length; i++) {
            System.out.println(inputArrays[i]);
        }
    }
}
