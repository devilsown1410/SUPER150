package Lec13;

public class Gas_Station {
    public static void main(String[] args) {
        int []gas={1,2,3,4,5};
        int []cost={3,4,5,1,2};
    }
    public static int Index(int []gas,int[]cost){
        int sum=0;
        for (int i = 0; i < gas.length; i++) {
            sum+=gas[i]-cost[i];
        }
        if(sum<0){
            return -1;
        }
        return 1;
    }
}
