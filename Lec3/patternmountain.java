package Lec3;

import java.util.Scanner;

public class patternmountain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=1;
        int n=sc.nextInt();
        int space=n+1;
        int star=1;
        int val=1;
        while(i<=n){
            int j=1;
            int k=1;
            while(j<=star){
                System.out.print(k+" ");
                k++;
                j++;
            }
            j=1;
            while(j<=space){
                System.out.print("  ");
                j++;
            }
            j=1;
            k=val;
            if(i==n){
                k=k-1;
                star--;
            }
            while(j<=star){
                System.out.print(k+" ");
                k--;
                j++;
            }
            i++;
            System.out.println();
            val++;
            star++;
            space-=2;
        }
    }
}
