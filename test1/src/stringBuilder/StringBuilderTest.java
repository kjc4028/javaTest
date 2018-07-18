package stringBuilder;


public class StringBuilderTest {

	public static void main(String[] args) {
		a1();
	}
	
	private static void a1(){
		StringBuilder a = new StringBuilder("test123");
		a.append("456");
		System.out.println(a);
	}

}
