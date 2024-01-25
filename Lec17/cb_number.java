package Lec17;

public class cb_number {
    public static void main(String[] args) {
        String s="81615";
        SubString(s);
    }
    public static void SubString(String s){
        int c=0;
        for(int i=1;i<=s.length();++i){
            for (int j = 0; j < s.length()-i; j+=i) {

                if(Iscb(Integer.parseInt(s.substring(j,j+i)))){
                    c++;
                }
            }
        }
        System.out.println(c);
    }
    public static boolean Iscb(int n){
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
