package Lec12;

import java.util.Scanner;

public class increasing_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;++i){
            arr[i]=sc.nextInt();

        }
        int c=0;
        for (int i = 0; i < n-1; i++) {
            if(arr[i+1]<arr[i]){
                int d=arr[i]-arr[i+1];
                c+=d;

                arr[i+1]=d;
            }

        }
        System.out.println(c);
    }
}
