package Lec3;

import java.util.Scanner;

public class pattern_15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=1;
        int n=sc.nextInt();
        int space=0;
        int star=n;
        int k=1;
        while (i<=(2*n)-1){
            int j=1;
            while(j<=space){
                System.out.print("  ");
                j++;
            }
            j=1;
            while(j<=star){
                System.out.print("* ");
                j++;
            }
            k++;
            if(k>n){
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
