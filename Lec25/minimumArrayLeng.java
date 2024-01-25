package Lec25;
import java.util.*;
public class minimumArrayLeng {

    public static void main(String[] args) {
        int []nums={5,5,5,10,5};
        System.out.println(minimumArrayLength(nums));
    }

        public static int display(int []arr,int g){
            int c=0;
            for(int i:arr){
                if (i==g) {
                    c++;
                }
            }
            return Math.max(1,(c+1)/2);
        }

        public static int check(int[] nums, int g) {
            for (int i = 0; i < nums.length; ++i) {
                while (nums[i] != 0) {
                    int t = nums[i];
                    nums[i] = g % nums[i];
                    g = t;
                }
            }
            return display(nums, g);
        }


        public static int minimumArrayLength(int[] nums) {

            Arrays.sort(nums);


            if (nums.length>2 && nums[0]!=nums[1]) {
                return 1;
            }

            return check(nums,nums[0]);

        }
}
