package assignment;

public class Check1 
{
	public static void method1(int p,int balance)
	{
		int count=0;
		System.out.println("confirm your pin to check balance");
		int b=Exce.input1();
		while(b!=p)
		{
			count++;
		if(count>2)
		{
			System.out.println("Your account is blocked for 24 hours please wait");
			System.exit(0);
		}
		System.out.println("enter the correct pin");
		b=Exce.input1();
		}
		if(b==p)
		{
			System.out.println("Your current balance is :"+ balance);
		}
	}
     public static void method2(int a,int b2, int c)
     {
    	 int count=0;
    	 System.out.println("confirm your pin");
    	 int b=Exce.input1();
    	 while(b!=a)
    	 {
    		count++;
    		if(count>2)
    		{
    			System.out.println("your account is blocked for 24 hours");
    			System.exit(0);
    		}
    		System.out.println("re enter the pin");
    		b=Exce.input1();
    	 }
    	 if(b==a)
    	 {
    		 System.out.println("Tranfer successfully");
    		 System.out.println("Your current balance is :" +(b2-c));
    	 }
    	 
     }
}
