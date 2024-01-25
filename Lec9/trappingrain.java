package Lec9;

public class trappingrain {
    public static void main(String[] args) {
        int []arr={2,3,-2,4};
        System.out.println(maxProduct(arr));
    }
    public static int maxProduct(int[] arr) {
        int n =arr.length;
        int [] left= new int[n];
        left[0]=arr[0];
        int l=1;
        int ans=1;
        for (int i = 1; i < left.length; i++) {
            ans*=l;
            l*=left[i];
        }
        int max=left[0];
        for(int i=0;i<left.length;++i){
            if (max<left[i]){
                max=left[i];
            }
        }
        return max;
    }
}
