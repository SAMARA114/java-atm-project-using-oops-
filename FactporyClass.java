package assignment;

import java.util.Scanner;

public class FactporyClass 
{
    public static Bank bank1()
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("1.for Sbi bank and 2.for Axis bank");
    	int a=Exce.input1();
    	if(a==1)
    	{
    		return new Sbi();
    	}
    	 else if(a==2)
    	{
    		return new Axis();
    	}
    	 else
    	 {
    		 System.out.println("enter valid option");
    		 return bank1();
    	 }
    	
    }
}
class Account
{
	public static void method2(Bank b)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("1.for balance and 2.for transfer");
		int a=Exce.input1();
		if(a==1)
		{
			b.balance();
		}
		else if(a==2)
		{
			b.transfer();
		}
		else
		{
			System.out.println("enter the correct value");
			method2(GpayMain.b);
		}
		
	}
	
}
