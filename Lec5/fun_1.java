package Lec5;

import java.util.Scanner;

public class fun_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(add(n));

    }
    public static int add(int a){
        if (a==0){
            return a=0;
        }
        else{
            return a+add(a-1);
        }
    }
}
