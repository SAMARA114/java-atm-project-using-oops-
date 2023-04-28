package assignment;
//import assignment.FactporyClass.Account;
import java.util.Scanner;

public class GpayMain {

	public static void main(String[] args) 
	{
		Setpin.setting();
		main1();

	}

	static Bank b;
	public static void main1()
	{
		Scanner sc= new Scanner (System.in);
		b=FactporyClass.bank1();
		Account.method2(b);
		System.out.println("1 for continue and any other for exit");
		int a= Exce.input1();
		if(a==1)
		{
			main1();
		}
		}
}
