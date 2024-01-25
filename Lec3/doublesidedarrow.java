package Lec3;

import java.util.Scanner;

public class doublesidedarrow {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=1;
        int n=sc.nextInt();
        int star=1;
        int val=1;
        int space1=n-1;
        int space2=0;
        while(i<=n){
            int j=1;
            while(j<=space1){
                System.out.print("\t");
                j++;
            }
            j=1;
            int k=val;
            while(j<=star){
                System.out.print(k+"\t");
                j++;
                k--;
            }
            j=1;
            while(j<=space2){
                System.out.print("\t");
                j++;
            }
            j=1;
            k=1;

            if (i==1|| i==n){
                j=2;
            }
            while(j<=star){
                System.out.print(k+"\t");
                j++;
                k++;
            }
            if (i>=n/2+1){
                star--;
                space1+=2;
                space2-=2;
                val--;
            } else{
                star++;
                space1-=2;
                space2+=2;
                val++;
            }
            if (i==1){
                space2=1;
            }
            i++;
            System.out.println();
        }
    }
}
