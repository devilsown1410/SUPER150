package Lec3;

import java.util.Scanner;

public class rhombuspattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=1;
        int n=sc.nextInt();
        int space=n-1;
        int star=5;
        int k=1;
        while(i<=n){
            int j=1;
            while(j<=space){
                System.out.print(" ");
                j++;
            }
            if(i==1 || i==n){
                j=1;
                while(j<=n){
                    System.out.print("*");
                    j++;
                }
            }
            else{
                j=1;
                while(j<=n){
                    if(j==1 || j==n){
                        System.out.print("*");
                    } else{
                        System.out.print(" ");
                    }
                    j++;
                }
            }
            i++;
            space--;
            System.out.println();
        }
    }
}
