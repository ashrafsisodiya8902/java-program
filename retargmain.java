import java.util.Scanner;
//return and argument
//inside main class
public class retargmain {

    int add(int a,int b) {
        int c = a+b;

    return c;
    }

    int subt(int a, int b) {
        int c = a-b;

        return c;
    }

    int mult(int a, int b) {
        int c = a*b;

        return c;
    }

    int div(int a, int b) {
        int c = a/b;

        return c;
    }

    int mod(int a, int b) {
        int c = a%b;

        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();

        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        retargmain k = new retargmain();
        
        int add = k.add(a,b);
        System.out.println("Addition is " + add);

        int subt = k.subt(a,b);
        System.out.println("Subtraction is " + subt);

        int mult = k.mult(a,b);
        System.out.println("Multiplication is " + mult);

        int div = k.div(a,b);
        System.out.println("Division is " + div);

        int mod = k.mod(a,b);
        System.out.println("Modulus is " + mod);

    }
}
    


