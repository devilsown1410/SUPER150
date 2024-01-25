package Lec3;
import java.util.*;
    public class main1 {
        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int k = n;
            int sum = 0;
            while (k != 0) {
                sum += k % 10;
                k /= 10;
            }
            k=n;
            int sum1 = 0;
            for (int j = 2; j < n; ++j) {
                while (k % j == 0) {
                    sum1+= j;
                    k /= j;
                }
            }
            if (sum == sum1) {
                System.out.println("1");
            } else{
                System.out.println("0");
            }
        }
    }