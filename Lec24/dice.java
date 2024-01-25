package Lec24;

import java.util.Scanner;

public class dice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=4;
        dice(0,n,"");
    }
    public static void dice(int i,int n,String ans){
        if (i==n) {
            System.out.println(ans);
            return;
        }
        if(i>n){
            return;
        }
//            dice(i+1,n,ans+"1");
//            dice(i+2,n,ans+"2");
//            dice(i+3,n,ans+"3");

//            For 'm' phases
        for (int d = 1; d <=n ; d++) {
            dice(i+d,n, ans+d);

        }

        }
}
