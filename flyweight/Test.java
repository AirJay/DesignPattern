package flyweight;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Integer i = Integer.valueOf(5);
		Integer j = Integer.valueOf(5);
		
		Integer m = Integer.valueOf(500);
		Integer n = Integer.valueOf(500);
		
		System.out.println(i==j);
		System.out.println(m==n);
		
		Character x;
		Long y;
		String s = "abc";
		String s1 = "abc";
		
		System.out.println(s==s1);

	}

}
