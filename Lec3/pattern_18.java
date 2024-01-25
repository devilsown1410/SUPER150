package Lec3;

import java.util.Scanner;

public class pattern_18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=1;
        int n=sc.nextInt();
        int star=1;
        int space=n/2;
        int k=1;
        while(i<=n){
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
            if (i>=(n/2)+1){
                star-=2;
                space++;
            }else{
                star+=2;
                space--;
            }
            i++;
            System.out.println();
        }
    }
}
