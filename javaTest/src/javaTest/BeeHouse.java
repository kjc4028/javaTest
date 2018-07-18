package javaTest;

import java.util.Scanner;

public class BeeHouse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in); 
		String num = "";
		
		num = scan.nextLine();
		
		int n = Integer.parseInt(num);
		int cnt = 1;
		int tmp = 1;
		int range = 1;
		
		while(true) {
			if(range >= n ) {
				break;
			}
			tmp=6*(cnt++);
			range+=tmp;
		}
		
		System.out.println(cnt);
		
	}

}
