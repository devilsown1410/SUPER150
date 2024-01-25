package Lec4;

import java.util.*;

public class Decimal_to_Binary {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int  n=sc.nextInt();
        int s=0;
        int sum=0;
        int k=0;
        while(n>0){
            int r=n%2;
            s=s+(int)(r*Math.pow(10,k));
            n=n/2;
            k++;
        }
        System.out.println(s);

    }
}
