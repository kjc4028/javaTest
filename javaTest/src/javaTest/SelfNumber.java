package javaTest;


public class SelfNumber {

	public static void main(String[] args) {
		
		for(int i=1; i<10000; i++) {
			int num = i;
			String inNum = Integer.toString(i);
			int inNumLen = inNum.length();
			
				for(int j =0; j< inNumLen; j++) {
					num +=Integer.parseInt(inNum.substring(j,j+1));
				}

			System.out.println(i);
			
		}
		
		
		
	}

}
