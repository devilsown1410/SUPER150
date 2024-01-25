package Lec19;

public class Wrapper_Class {
    public static void main(String[] args) {
        Integer a=10;
        int a1=10;
        System.out.println(a);
        System.out.println(a1);

//        Auto Boxing : transferring data stack memory to heap memory
        int b=9;
        Integer b1=90;
        b1=b;
        System.out.println(b1);
//        Un-boxing : transferring content from heap memory to stack memory
        Integer c=89;
        int c1=-7;
        c1=c;

        Integer e1 = 78;
        Integer e2=78;
        Integer e3=178;
        Integer e4=178;
//        System.out.println(e1==e2);  true

//        CacheHigh stores -128 to 127 if the number is in the range then e1 and e2 are allocated
//        same address but if the number is not in range then different address is allocated to same address and the second
//        statement return false

//        System.out.println(e3==e4); false

    }
}
