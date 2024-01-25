package Lec16;

public class String_Demo {

    public static void main(String[] args) {
        String str1="Hello";
        String str2="Hello";
        String str3=new String("Hello");
        String str4=new String("Hello");
        System.out.println(str1==str3);
        System.out.println(str1==str2);
        System.out.println(str4==str3);
        System.out.println(str1);
        str1=str1+"bye";
//        == compares only address not content.
//       for concat and + sign first copy of str1 is made and then new string is added and then the new string is
//       made of the pool.
//        String are immutable at same address but at different address it is possible by making copies.

        String s1="Kaju"+"Kamlesh";
//        When we add two literals then there is no importance of + sign and the address point out to
//        string s1 is made inside the pool.
    }
}
