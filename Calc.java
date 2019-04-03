import java.util.Scanner;
public class Calc{
	public static void main(String[] args){

		int a,b,add,mult,sub,div;
		Scanner sc = new Scanner(System.in);
		a=sc.nexInt();
		b=sc.nextInt();
		add=addition(a,b);
		mult=multiply(a,b);
		sub=subtract(a,b);
		div=divide(a,b);
	System.out.println("Addition = " +add);
	System.out.println("Multiplication = " +mult);
	System.out.println("subtraction = " +sub);
	System.out.println("division = " +div);
}

}