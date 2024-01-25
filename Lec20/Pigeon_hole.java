package Lec20;
import java.util.*;
public class Pigeon_hole {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int t = scn.nextInt();
        while(t-->0){
            int n = scn.nextInt();
            int[] arr=new int[n];
            for (int i = 0; i < n; i++)
                arr[i]=scn.nextInt();
            System.out.println(subarraysDivByK(arr, n));
        }
    }
    public static long subarraysDivByK(int[] nums, int k) {
        // Write your code here
        



        return k;
    }
}
