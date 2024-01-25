package Lec8;

import java.util.Arrays;

public class Selection_sort {
    public static void main(String[] args) {
        int []arr={2,4,5,1,7,3};
        int k=1;
        for (int i = 0; i < arr.length; i++) {
            int z=min_index(arr,i);
            int temp=arr[z];
            arr[z]=arr[i];
            arr[i]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static int min_index(int[]arr,int k){
        for (int i = k+1; i <arr.length; i++) {
            if(arr[i]<arr[k]){
                k=i;
            }
        }
        return k;
    }
}
