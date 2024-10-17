package baekjoon.bronze;

    import java.util.Scanner;

    public class S5_14916 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int price = sc.nextInt();
            if (price < 5 && price % 2 == 1) {
                System.out.println(-1);
            } else {
                int coin5 = price / 5;
                price %= 5;
                if (price % 2 != 0) {
                    price += 5;
                    coin5--;
                }
                int coin2 = price / 2;
                System.out.println(coin2 + coin5);
            }
        }
    }

