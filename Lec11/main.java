package Lec11;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n= sc.nextInt();
            int arr[]=new int[n];
            int s=0;
            for (int i = 0; i < n-1; i++) {
                arr[i]=sc.nextInt();
                s+=arr[i];
            }
            System.out.println(s*(-1));
        }
    }
}
