package Lec11;

import java.util.*;
public class nextpermutation {
    public static void main(String args[]) {

        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        while(t-->0){

            int n=sc.nextInt();

            int num1[]=new int[n];

            for(int i=0;i<n;++i){

                num1[i]=sc.nextInt();

            }
            int p=-1;
            for(int i=num1.length-2;i>=0;--i){
                if (num1[i]<num1[i+1]){
                    p=i;
                    break;
                }
            }
            int q=-1;
            for(int i=num1.length-1;i>p;--i){
                if(num1[i]>num1[p]){
                    q=i;
                    break;
                }
            }

            int temp=num1[p];

            num1[p]=num1[q];

            num1[q]=temp;
            
            int k=p+1;
            int l=num1.length-1;
            while(p<l) {
                int temp1 = num1[p];
                num1[p] = num1[l];
                num1[l] = temp1;

                p++;
                l--;
            }
            for(int i=0;i<n;++i){

                System.out.print(num1[i]+" ");

            }

        }

    }
}
