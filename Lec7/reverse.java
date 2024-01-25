package Lec7;
import java.util.*;
public class reverse {
    public static void main(String[] args) {
        int arr[]={2,4,5,1,7,9};
        System.out.println(Arrays.toString(reverse(arr)));
    }
    public static int[] reverse(int []arr){
        if(arr.length==1){
            return arr;
        }
        int i=0;
        int j=arr.length-1;
        while(i<j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return arr;
    }
}
