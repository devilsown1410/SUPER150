package Lec21;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class formbiggest {


        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int test = sc.nextInt();

            while (test-- > 0) {

                int n = sc.nextInt();

                String[] arr1 = new String[n];


                for (int i = 0; i < n; i++) {
                    arr1[i] = sc.next();
                }

                Arrays.sort(arr1, new MyComparator());

                for (int i = 0; i < n; i++) {
                    System.out.print(arr1[i]);
                }

                System.out.println();
            }
        }

        public static void MinPages(int[] page,int nos){
            int lo=0;

            int hi=0;

            for(int i=0;i<page.length;++i){
                hi=hi+page[i];
            }
            int ans=0;
            while(lo<=hi){
                int mid=(lo+hi)/2;
                // // if(isitpossible(page,nos,mid)){
                //     ans=mid;
                //     hi=mid-1;
                // }
                // else{
                //     lo=mid+1;
                // }
            }

        }

        static class MyComparator implements Comparator<String> {
            @Override
            public int compare(String X, String Y) {

                String XY = X + Y;


                String YX = Y + X;


                return XY.compareTo(YX) > 0 ? -1 : 1;
            }
        }
    

}
