package Lec2;

import java.util.Scanner;

public class pattern_21 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int i=1;int n=sc.nextInt();
        int star=1;
        int space=2*n-3;
        while(i<=n){
            int j=1;
            while(j<=star){
                System.out.print("* ");
                j++;
            }
            j=1;
            while(j<=space){
                System.out.print("  ");
                j++;
            }
            j=1;
            if(i==n){
                j=2;
            }
            while(j<=star){
                System.out.print("* ");
                j++;
            }
            i++;
            star++;
            space-=2;
            System.out.println();
        }


    }
}
