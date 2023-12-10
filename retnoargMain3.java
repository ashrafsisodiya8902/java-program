import java.util.Scanner;
//in two different class
//return and no argument
class A {

    byte show1() 
    {
        System.out.print("Enter the byte value: ");
        byte a = sc.nextByte();

        return a;
    }

    short show2() 
    {
        System.out.print("Enter the short value: ");
        short a = sc.nextShort();

        return a;
    }

}

class B {
    long show3() 
    {
        System.out.print("Enter the long value: ");
        long a = sc.nextLong();

        return a;
    }

    double show4()
    {
        System.out.print("Enter the double value: ");
        double a = sc.nextDouble();

        return a;
    }
}
class C {
    boolean show5() 
    {
        System.out.print("Enter the boolean value: ");
        boolean a = sc.nextBoolean();

        return a;
    }

    float show6() 
    {
        System.out.print("Enter the float value: ");
        float a = sc.nextFloat();

        return a;
    }
}
    
    
public class retnoargMain3 {
    char show7() 
    {
        System.out.print("Enter the char value: ");
        char a = sc.next().charAt(0);

        return a;
    }
    String show8() 
    {
        System.out.print("Enter the string value: ");
        String a = sc.next();

        return a;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        retnoargMain3 k0 =new retnoargMain3();
        A k = new A();
        B k1 = new B();
        C k2 = new C();

    byte b = k.show1();
    System.out.println(b);

    short c = k.show2();
    System.out.println(c);

    long d = k1.show3();
    System.out.println(d);

    double e = k1.show4();
    System.out.println(e);

    boolean f = k2.show5();
    System.out.println(f);

    float g = k2.show6();
    System.out.println(g);

    char h = k0.show7();
    System.out.println(h);

    String i = k0.show8();
    System.out.println(i);
    }
}

