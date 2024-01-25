package Lec5;

import java.util.Scanner;

public class inverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=1;
        int sum=0;
        while(n>0){
            int r=n%10;
            sum+=k*(int)Math.pow(10,r-1);
            n/=10;
            k++;
        }
        System.out.println(sum);
    }
}
