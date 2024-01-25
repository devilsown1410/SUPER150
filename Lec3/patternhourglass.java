package Lec3;

import java.util.Scanner;

public class patternhourglass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=1;
        int n=sc.nextInt();
        int star=n;
        int space=0;
        int k=n;
        while(i<=(2*n)+1){
            int j=1;
            while(j<=space){
                System.out.print("  ");
                j++;
            }
            j=1;
            int z=k;
            while(j<=star) {
                System.out.print(z + " ");
                j++;
                z--;
            }
            System.out.print("0"+" ");
            j=1;
            z=1;
            while(j<=star){
                System.out.print(z+" ");
                j++;
                z++;
            }if (i>=n+1){
                space--;
                star++;
                k++;
            } else{
            space++;
            k--;
            star--;
            }
            i++;
            System.out.println();
        }
    }
}
