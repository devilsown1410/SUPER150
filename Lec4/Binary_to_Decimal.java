package Lec4;

import java.util.Scanner;

public class Binary_to_Decimal {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int  n=sc.nextInt();
        int sum=0;
        int k=0;
        while(n>0){
            int r=n%10;
            sum=sum+(int)(r*Math.pow(2,k));
            k++;
            n/=10;
        }

        System.out.println(sum);
    }
}
