package string;

public class StringComparison {
	public static void main(String args[])
	{
		String s1 = "yellow";
		String s2 = "yellow";
		String s = new String("yellow");
		String s4 = "pink";
		String s5 = "YELLOW";
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s5));
		System.out.println(s.equals(s2));
		System.out.println(s2.equalsIgnoreCase(s5));
		System.out.println(s1==s2);
		System.out.println( s==s1);
		System.out.println(s1.compareTo(s4));
		System.out.println(s4.compareTo(s1));

	}


}
