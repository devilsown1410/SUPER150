package Lec4;

import java.util.Scanner;

public class gcd_new {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int  x=sc.nextInt();
        int y=sc.nextInt();
        int dividend=Math.max(x,y);
        int divisor=Math.min(x,y);
        while(dividend%divisor!=0){
            int rem=dividend%divisor;
            dividend=divisor;
            divisor=rem;
        }
        System.out.println(divisor);
    }
}
