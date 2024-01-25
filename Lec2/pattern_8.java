package Lec2;

import java.util.Scanner;

public class pattern_8 {
    public static void main(String[] args) {
        int i=1;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int f=0;
        int l=n-1;
        while (i<=n){
            int j=0;
            while (j<=n) {
                if (j == f || j == l) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
                j++;
            }
            i++;
            f++;
            l--;
            System.out.println();
        }
    }
}
