package Lec21;
import java.util.*;
public class CB {

        public static void main(String args[]) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            String str=sc.next();
            System.out.println(SubString(str));
        }
        public static int SubString(String s){
            int c=0;
            boolean [] visited=new boolean[s.length()];
            for(int i=1;i<=s.length();++i){
                for (int j = i; j <=s.length(); j++) {
                    int len =j-i;
                    String str=s.substring(len,j);
                    if(Iscb(Long.parseLong(str)) && IsVisited(visited,len,j-1) ){
                        c++;
                        for(int k=len;k<=j-1;++k){
                            visited[k]=true;
                        }
                    }
                }
            }
            return c;
        }
        public static boolean IsVisited(boolean [] visited, int i,int j){
            for(int x=i;x<=j;++x){
                if(visited[x]==true){
                    return false;
                }
            }
            return true;

        }
        public static boolean Iscb(long n){
            if (n==0 || n==1){
                return false;
            }
            int []arr={2,3,5,7,11,13,17,19,23,29};

            for(int i=0;i<arr.length;++i) {
                if (n == arr[i]) {
                    return true;
                }
            }

            for(int i = 0; i<arr.length; ++i){
                if(n%arr[i]==0){
                    return false;
                }
            }
            return true;
        }
    }

