package Lec2;

import java.util.Scanner;

public class pattern_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=5;
        int i=1;
        int val=1;
        while(i<=n){
            int k=i;
            while(k>0){
                System.out.print(val+"\t");
                val++;
                k--;
            }
            System.out.println();
            i++;
        }
    }
}
