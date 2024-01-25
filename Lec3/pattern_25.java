package Lec3;

import java.util.Scanner;

public class pattern_25 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=1;
        int n=sc.nextInt();
        int star=1;
        int val=1;
        int space=n-1;
        while(i<=n){
            int j=1;
            while(j<=space){
                System.out.print("\t");
                j++;
            }
            j=1;
            while(j<=star){
                System.out.print(val+"\t");
                val++;
                j++;
            }
            i++;
            space--;
            star+=2;
            System.out.println();
        }
    }

}
