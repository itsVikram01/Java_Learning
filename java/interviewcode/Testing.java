package interviewcode;

import java.io.IOException;


class A {
    int x = 10;
}
class B extends A {
    int x = 20;
}
public class Testing {
    public static void main(String[] args) {
        System.out.println("Hello World");
        A a = new A();
        System.out.println(a.x); //10

        B b = new B();
        System.out.println(b.x); //20

        A ab = new B();
        System.out.println(ab.x); //10

        try{
            int i = 1/0;
        }/*catch (ArithmeticException ae){
            System.out.println("ArithmeticException");
        }*//*catch (IOException e){
            System.out.println("IOException");
        }*/catch (Exception e){
            /*System.out.println("Exception");*/
            System.out.println(e);
            e.printStackTrace();
        }

    }

    public void m1(int a, int b){
        System.out.println("Hello World");
    }

    /*public int m1(int a, int b){
        return a+b;
    }*/

    public String m1(String b, int a){
        return a+b;
    }
}
