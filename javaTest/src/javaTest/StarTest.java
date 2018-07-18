package javaTest;

import java.util.Scanner;

public class StarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in); 

		String num = "";
		num = scan.nextLine();
		int n = Integer.parseInt(num);
		
			for( int i=1; i<=n; i++)
			{
				for( int j=1; j<=i; j++)
				{
					System.out.printf("*");
				}
				System.out.println("");
			}
	}

}
