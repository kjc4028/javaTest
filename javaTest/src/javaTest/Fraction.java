package javaTest;

import java.util.Scanner;

public class Fraction {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		String num = "";
		int up=0;
		int down=0;
		int row=0;
		boolean bool = false;
		num = scan.nextLine();
		
		int n = Integer.parseInt(num);
		
		for(int i=1; i<=n; i++) {
			for(int j=0; j<i; j++) {
				if(i%2==1) {
					up=i-j;
					down=j+1;
				}
				if(i%2==0) {
					down=i-j;
					up=j+1;
				}
				row++;
				if(row==n) {
					bool=true;
					break;
				}
			}
			if(bool) {
				break;
			}
		}
		System.out.println(up+"/"+down);
	}
}
