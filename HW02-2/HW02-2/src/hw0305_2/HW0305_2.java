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
			System.out.println("�п�J�@�ӼƦr");
			guess=sc.nextInt();
			int validate_num=ans-guess;			
						

			if(validate_num>0)
			{
				System.out.println("��J���Ʀr�Ӥp�F");
				min=guess;			
				System.out.print("�Ʀr����"+min+"�M"+max);			
				
			}
			else if (validate_num<0) 
			{
				System.out.println("��J���Ʀr�Ӥj�F");
				max=guess;	
				System.out.print("�Ʀr����"+min+"�M"+max);
			}
			else
			{
				System.out.println("�q���o");
				break;
			}
		}		
	}	
}
