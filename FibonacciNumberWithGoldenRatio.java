import java.util.*;

class Fibonacci
{
	public static void main(String args[])
	{
		int f1=1, f2=2;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number:");
		int n=sc.nextInt();
		
		System.out.println("Fibonacci Series Upto " + n + ":");
		System.out.println(f1+"\t");
		
		
		while(f1<=n){
			System.out.print(f1+"\t");
			float f3=(f2)/(f1);
			System.out.println(+f3);
			int nextTerm=f1+f2;
			f1=f2;
			f2=nextTerm;
			
			
		}
	}
}