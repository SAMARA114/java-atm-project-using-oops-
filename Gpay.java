package assignment;
import java.util.Scanner;
import java.util.Random;
public class Gpay
{
private static Gpay i=null;
//private Gpay()
//{
//	
//}
public static Gpay create()
{
	if(i==null)
	{
		i=new Gpay();
	}
	return i;
}
private int pin;
private int upipin;


public int getPin() {
	return pin;
}
public void setPin(int pin) {
	this.pin = pin;
}
public int getUpipin() {
	return upipin;
}
public void setUpipin(int upipin) {
	this.upipin = upipin;
}

}

abstract class Bank extends Gpay
{
	public abstract void balance();
	public abstract void transfer();
}

class Setpin
{
	static int h;
	static int j;
	public static void setting()
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the registered mobile number");
		long phno=Exce.input();
		long temp=phno;
		int count=0;
		while(temp>0)
		{
			temp=temp/10;
			count++;
		}
		while(count!=10)
		{
			System.out.println("entered phone number is invalid and enter correct number");
			phno=Exce.input();
			count=0;
			temp=phno;
			while(temp>0)
			{
				temp=temp/10;
				count++;
			}
		}
		
		Random r=new Random();
		int otp=r.nextInt(8999)+1000;
		System.out.println(otp);
		System.out.println("enter otp");
		int a=Exce.input1();
		while(otp!=a)
		{
			System.out.println("enter the correct otp");
			a=Exce.input1();
		}
		
		Gpay gp=Gpay.create();
		System.out.println("set pin for sbi bank");
		Exce.input2();
		int count1=0;
		int g=gp.getPin();
		while(g>0)
		{
			g=g/10;
			count1++;
		}
		while(count1!=4)
		{
			System.out.println("enter the 4 digit pin only");
			Exce.input2();
			int k=gp.getPin();
			count1=0;
			while(k>0)
			{
				k=k/10;
				count1++;
			}
		}
		h=gp.getPin();
		
	  System.out.println("set pin for Axis bank");
	  Exce.input2();
		int count2=0;
		int g1=gp.getPin();
		while(g1>0)
		{
			g1=g1/10;
			count2++;
		}
		while(count2!=4)
		{
			System.out.println("enter the 4 digit pin only");
			Exce.input2();
			int k1=gp.getPin();
			count2=0;
			while(k1>0)
			{
				k1=k1/10;
				count2++;
			}
		}
		j=gp.getPin();
	}
}

class Sbi extends Bank
{
	static int balance1=10000;
	static int p=Setpin.h;
	@Override
	public void balance()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter your pin to check balance");
		int a2=Exce.input1();
		int count=0;
		while(a2!=p)
		{
			count++;
			if(count>2)
			{
				System.out.println("Your account is blocked for 24 hours please wait");
				System.exit(0);
			}
			System.out.println("enter the correct pin");
			a2=Exce.input1();
			
		}
		if(a2==p)
		{
			Check1.method1(p,balance1);
		}
	}
	@Override
	public void transfer()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter phone number to transfer the money");
		long phno=Exce.input();
		long temp=phno;
		int count=0;
		while(temp>0)
		{
			temp=temp/10;
			count++;
		}
		while(count!=10)
		{
			System.out.println("Enter the correct phone number");
	     	phno=Exce.input();
			count=0;
			temp=phno;
			while(temp>0)
			{
				temp=temp/10;
				count++;
			}
		}
		
			System.out.println("Enter the amount to transfer");
			int b=Exce.input1();
			if(b<balance1)
			{
				System.out.println("Enter your pin to transfer");
				int a1=Exce.input1();
				int count1=0;
				while(a1!=p)
				{
					count1++;
					if(count1>2)
					{
						System.out.println("Your account is blocked for 24 hours please wait");
						System.exit(0);
					}
					System.out.println("Enter the correct pin");
					a1=Exce.input1();
			}
				if(a1==p)
				{
					Check1.method2(p, balance1,b);
				}
		}
		
	
}
}
class Axis extends Bank
{
	static int balance1=50000;
	static int p=Setpin.j;
	@Override
	public void balance()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter your pin to check balance");
		int a2=Exce.input1();
		int count=0;
		while(a2!=p)
		{
			count++;
			if(count>2)
			{
				System.out.println("Your account is blocked for 24 hours please wait");
				System.exit(0);
			}
			System.out.println("enter the correct pin");
			a2=Exce.input1();
			
		}
		if(a2==p)
		{
			Check1.method1(p,balance1);
		}
	}
	@Override
	public void transfer()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter phone number to transfer the money");
		long phno=Exce.input();
		long temp=phno;
		int count=0;
		while(temp>0)
		{
			temp=temp/10;
			count++;
		}
		while(count!=10)
		{
			System.out.println("Enter the correct phone number");
	     	phno=Exce.input();
			count=0;
			temp=phno;
			while(temp>0)
			{
				temp=temp/10;
				count++;
			}
		}
		
			System.out.println("Enter the amount to transfer");
			int b=Exce.input1();
			if(b<balance1)
			{
				System.out.println("Enter your pin to transfer");
				int a1=Exce.input1();
				int count1=0;
				while(a1!=p)
				{
					count1++;
					if(count1>2)
					{
						System.out.println("Your account is blocked for 24 hours please wait");
						System.exit(0);
					}
					System.out.println("Enter the correct pin");
					a1=Exce.input1();
			}
				if(a1==p)
				{
					Check1.method2(p, balance1,b);
				}
		}
		
	
}
}
class Exce
{
	static long ph1=0;
	public static long input()
	{
		try
		{
			Scanner sc=new Scanner(System.in);
			ph1=sc.nextLong();
			
		}
		catch(Exception e)
		{
			System.out.println("enter correct  number");
			input();
		}
		return ph1;
	}
	static int a1=0;
	public static int input1()
	{
		try
		{
			Scanner sc=new Scanner(System.in);
			a1=sc.nextInt();
		}
		catch(Exception e)
		{
		     System.out.println("enter correct number");
		     input1();
		}
		return a1;
	}
    public static void input2()
    {
    	Gpay gp=Gpay.create();
    	try
    	{
    		Scanner sc=new Scanner(System.in);
    		gp.setPin(sc.nextInt());
    	}
    	catch(Exception e)
    	{
    		System.out.println("enter the only numbers");
    		input2();
    	}
    }
}
