package epam;

import java.util.*;

public class Calculation {
	private static Scanner sc;

	public static void main(String args[])
	{
		sc = new Scanner(System.in);
		int result=0;
		System.out.println("1.addition\n2.substraction\n3.multiplication\n4.Divide");
		int ch=sc.nextInt();
		while(ch!=0)
		{
			System.out.println("enter number1");
			int n1=sc.nextInt();
			System.out.println("enter number2");
			int n2=sc.nextInt();

		if(ch==1)
		{
			Addition addition=new Addition();
			result=addition.cal(n1,n2,result);
			System.out.println("n1+"+"n2="+result);
		}
		else if(ch==2)
		{
			Substraction sub=new Substraction();
			result=sub.cal(n1,n2,result);
			System.out.println("n1-"+"n2="+result);	
		}
		else if(ch==3)
		{
			Multiplication mul=new Multiplication();
			result=mul.cal(n1,n2,result);
			System.out.println("n1*"+"n2="+result);	
		}
		else if(ch==4)
		{
			Divide div=new Divide();
			result=div.cal(n1,n2,result);
			System.out.println("n1/"+"n2="+result);	

		}
		System.out.println("enter choice(or) to exit enter 0 :");
		ch=sc.nextInt();
			}
	}
}