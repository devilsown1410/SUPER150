package Lec23;

public class count {
    public static void main(String[] args) {
        String ques="abc";
        System.out.println("\n"+count(ques,""));
    }
    public static int count(String ques,String ans){
        if (ques.isEmpty()){
            System.out.println(ans);
            return 1;
        }
        char ch=ques.charAt(0);
        int a=count(ques.substring(1),ans);
        int b=count(ques.substring(1),ans+ch); //
        return a+b;

    }
}

