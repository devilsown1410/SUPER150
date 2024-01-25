package Lec3;

import java.util.Scanner;

public class pattern_19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=1;
        int n=sc.nextInt();
        int star=n/2+1;
        int space=0;
        int k=1;
        while(i<=n){
            if (i==2){
                space=1;
            }
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
            int l=1;
            if(i==1|| i==n){
                l=2;
            }
            while(l<=star){
                System.out.print("* ");
                l++;
            }
            if (i>=n/2+1){
                star++;
                space-=2;
            } else{
                star--;
                space+=2;
            }
            i++;
            System.out.println();
        }
    }
}
