import java.util.Scanner;

public class multipleanddivisibleby3and7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number");
        int num=sc.nextInt();

        if(num%3==0 && num%7==0 ){
            System.out.println("the number is multiple and divisible by 3 and 7");
        }
        else{
            System.out.println("the number is not multiple and divisible by 3 and 7");
        }
            
        }
    }