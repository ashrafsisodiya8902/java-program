import java.util.Scanner;

public class voterid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the value: ");
        int a = sc.nextInt();

        if (a >= 18) {
            System.out.println("eligible for vote");
        } else {
            System.out.println("not eligible for vote");
        }
    }
}
    

