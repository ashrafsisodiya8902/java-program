import java.util.Scanner;
class Studentgradeandpercentage
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Five Subject Marks :");
		int dsa = sc.nextInt();
		int c = sc.nextInt();
		int sql = sc.nextInt();
		int english = sc.nextInt();
		int java = sc.nextInt();
		int total = dsa+c+sql+english+java;
		float per = total/5;
		System.out.println("Total :"+total);
		System.out.println("Percentage :"+per);	
		if(per>=80){
		System.out.println("Grade A");
		}
		else if(per>=60 && per<80){
		System.out.println("Grade B");
		}
		else if(per>=50 && per<60){
		System.out.println("Grade C");
		}
		else if(per>=45 && per<50){
		System.out.println("Grade D");
		}
		else if(per>=25 && per<45){
		System.out.println("Grade E");
		}
		else{
		System.out.println("Grade F");}
	}
}