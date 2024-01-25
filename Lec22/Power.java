package Lec22;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=3;
        int b=4;
        System.out.println(pow(a,b));
    }
    public static int pow(int a,int b){

        if (b==0){
            return 1;
        }
        return a*pow(a,b-1);
    }
}
