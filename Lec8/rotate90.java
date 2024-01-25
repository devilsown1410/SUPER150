package Lec8;

public class rotate90 {
    public static void main(String[] args) {
        int arr[][]={{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        for (int i=0;i<arr.length;++i){
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        int arr1[][]=rotate(arr);

        for (int i=0;i<arr1.length;++i){
            for (int j = 0; j < arr1[0].length; j++) {
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int[][] rotate(int [][]arr){
        int arr1[][]=new int[arr.length][arr[0].length];
        int i=arr.length;
        int j=0;
        for(int k=0;k<arr.length;k++){
            int z=i-1;
            for (int l = 0; l <arr[0].length ; l++) {
                arr1[k][l]=arr[z][j];
                z--;
            }
            j++;
        }
        return arr1;
    }
}
