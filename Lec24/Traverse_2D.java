package Lec24;

import java.util.Scanner;

public class Traverse_2D {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int m=3;
        int n=3;
        int res=0;
        path(res,0,0,m-1,n-1,"");
    }
    public static void path(int res,int i,int j,int m,int n,String ans) {
        if (i == m && j == n) {
            System.out.println(ans);
            return;
        }
        if (i > m || j > n) {
            return;
        }
        path(res, i + 1, j, m, n,ans+"H");
        path(res, i, j + 1, m, n,ans+"V");
    }
}
