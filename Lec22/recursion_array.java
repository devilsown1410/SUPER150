package Lec22;

public class recursion_array {
    public static void main(String[] args) {
        int arr[]={2,3,4,5,4,3,4,7};
        int target=7;
        int i=0;
        System.out.println(search(arr,target,i));
    }
    public static int search(int []arr,int target,int i){
        if (arr[i]==target){
            return i;
        }
        if (i==arr.length-1){
            return -1;
        }
        return search(arr,target,i+1);
    }
}
