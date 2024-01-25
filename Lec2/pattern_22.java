package Lec2;

import java.util.Scanner;

public class pattern_22 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int i=1;int n=sc.nextInt();
        int star=n;
        int space=-1;
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
            int k=star;
            if(i==1){
                k=star-1;
            }
            while(j<=k){
                System.out.print("* ");
                j++;
            }
            i++;
            star--;
            space+=2;
            System.out.println();
        }


    }
}
