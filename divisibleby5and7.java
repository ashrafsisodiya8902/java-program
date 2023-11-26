import java.util.Scanner;

public class divisibleby5and7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number");
        int num=sc.nextInt();

        if(num%5==0 && num%7==0 ){
            System.out.println("the number is divisible by 5 and 7");
        }
        else{
            System.out.println("the number is not divisible by 5 and 7");
        }
            
        }
    }