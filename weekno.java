import java.util.Scanner;

public class weekno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Enter the value: ");
        int num = sc.nextInt();

        if (num == 1) {
            System.out.println("sunday");
        } else if (num == 2) {
            System.out.println("monday");
        } else if(num == 3){
            System.out.println("tuesday");
        }
        else{
            System.out.println("invalid"); 
        }
    }
}