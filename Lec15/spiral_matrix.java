package Lec15;

public class spiral_matrix {
    public static void main(String[] args) {
        int [][]arr={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        Print(arr);

    }
    public static void Print(int [][]arr){
        int minr=0;
        int maxr=arr.length-1;
        int minc=0;
        int c=0;
        int t=arr.length*arr[0].length;
        int maxc=arr[0].length-1;
        while(c<t){
            for (int i = minc; i <= maxc && c<t ; i++) {
                System.out.print(arr[minr][i]+"\t");
                c++;
            }

            minr++;
            for (int i = minr; i <=maxr && c<t; i++) {
                System.out.print(arr[i][maxc]+"\t");
                c++;
            }
            maxc--;
            for (int i = maxc; i >=minc && c<t ; i--) {
                System.out.print(arr[maxr][i]+"\t");
                c++;
            }
            maxr--;
            for (int i = maxr; i >=minr  && c<t; i--) {
                System.out.print(arr[i][minc]+"\t");
                c++;
            }
            minc++;
        }
    }

}
