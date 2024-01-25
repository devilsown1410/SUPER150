package Lec10;

public class binary_search {
    public static void main(String[] args) {
        int arr[]={5,7,7,8,8,10};
        int target=9;
        System.out.println(search(arr,target));
    }
    public static int search(int []arr,int target){
        int lo=0;
        int hi=arr.length-1;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if (arr[mid]==target){
                return mid;
            } else if(arr[mid]>target){
                hi=mid-1;
            } else{
                lo=mid+1;
            }
        }
        return -1;
    }
}
