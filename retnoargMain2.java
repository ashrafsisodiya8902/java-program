import java.util.Scanner;
//outer main class
//no return and no argument
class j {
    Scanner sc = new Scanner(System.in);

    int show1() 
    {
        System.out.print("Enter the int value: ");
        int a = sc.nextInt();

        return a;
    }
    byte show2() 
    {
        System.out.print("Enter the byte value: ");
        byte a = sc.nextByte();

        return a;
    }

    short show3() 
    {
        System.out.print("Enter the short value: ");
        short a = sc.nextShort();

        return a;
    }

    long show4() 
    {
        System.out.print("Enter the long value: ");
        long a = sc.nextLong();

        return a;
    }

    double show5()
    {
        System.out.print("Enter the double value: ");
        double a = sc.nextDouble();

        return a;
    }

    boolean show6() 
    {
        System.out.print("Enter the boolean value: ");
        boolean a = sc.nextBoolean();

        return a;
    }

    float show7() 
    {
        System.out.print("Enter the float value: ");
        float a = sc.nextFloat();

        return a;
    }

    char show8() 
    {
        System.out.print("Enter the char value: ");
        char a = sc.next().charAt(0);

        return a;
    }
}

public class retnoargMain2{
public static void main(String[] args) {
    j k = new j();
    int a = k.show1();
    System.out.println(a);

    byte b = k.show2();
    System.out.println(b);

    short c = k.show3();
    System.out.println(c);

    long d = k.show4();
    System.out.println(d);

    double e = k.show5();
    System.out.println(e);

    boolean f = k.show6();
    System.out.println(f);

    float g = k.show7();
    System.out.println(g);

    char h = k.show8();
    System.out.println(h);

}
}

