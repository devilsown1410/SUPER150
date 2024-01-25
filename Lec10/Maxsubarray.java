package Lec10;
import java.util.*;
public class Maxsubarray {
    public static void main(String[] args) {
        int arr[]={-2,1,-3,4,-1,2,1,-5,5};
//        int arr[]={-1,-2,-3,-6,-8,-9};
        System.out.println(subarray(arr));
    }
    public static int subarray(int [] arr){
        int s=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int d=0;
            for(int j=i;j<arr.length;++j){
                d+=arr[j];
                if (s<d) {
                    s = d;
                }
                if (d<0){
                    d=0;
                }
            }
        }
        return s;
    }
}
