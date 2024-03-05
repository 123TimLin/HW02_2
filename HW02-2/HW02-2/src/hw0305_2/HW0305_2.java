package hw0305_2;

import java.util.Scanner;
import java.util.Random;

public class HW0305_2 
{
	public static void main(String[] args)
	 {
		Random rand =new Random();
		int ans=rand.nextInt(100);
		int guess=0;	
		Scanner sc = new Scanner(System.in);
		int max=100;
		int min=1;
		while (true) 
		{
			System.out.println("叫块计");
			guess=sc.nextInt();
			int validate_num=ans-guess;			
						

			if(validate_num>0)
			{
				System.out.println("块计び");
				min=guess;			
				System.out.print("计ざ"+min+"㎝"+max);			
				
			}
			else if (validate_num<0) 
			{
				System.out.println("块计び");
				max=guess;	
				System.out.print("计ざ"+min+"㎝"+max);
			}
			else
			{
				System.out.println("瞦癸舘");
				break;
			}
		}		
	}	
}
