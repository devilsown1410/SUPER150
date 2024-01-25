package Lec6;

import java.util.Scanner;

public class Array_demo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int j=0;
        while (j<n){
            arr[j]=sc.nextInt();
            j++;
        }
        Display(arr);
    }
    public static void Display(int [] arr){
        int j=0;
        while (j<arr.length){
            System.out.print(arr[j]+" ");
            j++;
        }
    }
}
