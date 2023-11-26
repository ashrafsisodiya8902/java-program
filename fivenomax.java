import java.util.Scanner;

public class fivenomax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();

        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();

        System.out.print("Enter the value of c: ");
        int c = sc.nextInt();

        System.out.print("Enter the value of d: ");
        int d = sc.nextInt();

        System.out.print("Enter the value of e: ");
        int e = sc.nextInt();

        if (a > b && a > c && a>d && a>e) {
            System.out.println("a is greaterthan b,c,d and e");
        } else if (b > a && b > c && b>d && b>e) {
            System.out.println("b is greaterthan a,c,d and e");
        } else if (c > a && c > b && c>d && c>e) {
            System.out.println("c is greaterthan a,b,d and e");
        }
        else{
            System.out.println("e is greaterthan a,b,c and d");
        }
    }
}