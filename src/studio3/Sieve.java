package studio3;
import java.util.Scanner;
public class Sieve {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println(" What is n: ");
		int n = in.nextInt();
		
		boolean [] check = new boolean [n];
		for (int i = 2; i < check.length; i++)
		{
			for (int j = i; j < check.length; j+=i)
			{
				check [j] = true;
			}
		}
		
		for (int i = 2; i < check.length; i++)
		{
			if (check [i] == false)
			System.out.println(i);
		}
		
	}
}
