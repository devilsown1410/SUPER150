package Lec3;

import java.util.Scanner;

public class invertedhourglass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=1;
        int n=sc.nextInt();
        int star=1;
        int space=2*n-1;
        while(i<=(2*n)+1){
            int j=1;
            int z=n;
            while(j<=star){
                System.out.print(z+" ");
                z--;
                j++;
            }
            j=1;
            while(j<=space){
                System.out.print("  ");
                j++;
            }
            j=1;
            z=n-i+1;
            if(i==n+1){
                j=2;
                z++;
            }
            if (i>n+1){
                z=i-n-1;
            }
            while(j<=star){
                System.out.print(z+" ");
                z++;
                j++;
            }
            if(i>n){
                space+=2;
                star--;
            } else{
                space-=2;
                star++;
            }
            i++;
            System.out.println();
        }
    }
}
