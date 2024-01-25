package Lec18;

import java.util.*;
public class Book_Algorithm {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int nos=sc.nextInt();
            int []page=new int[n];
            for(int i=0;i<n;++i){
                page[i]=sc.nextInt();
            }
            System.out.println(MinPages(page,nos));
        }
    }
    public static int MinPages(int[] page,int nos){
        int lo=0;
        int hi=0;
        for(int i=0;i<page.length;++i){
            hi=hi+page[i];
        }
        int ans=0;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(isitpossible(page,nos,mid)){
                ans=mid;
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        return ans;
    }
    public static boolean isitpossible(int []page,int nos,int mid){
        int i=0;
        int read=0;
        int student=1;
        while(i<page.length){
            if(read+page[i]<=mid){
                read+=page[i];
                i++;
            }
            else{
                student++;
                read=0;
            }
            if(student>nos){
                return false;
            }
        }
        return true;
    }
}