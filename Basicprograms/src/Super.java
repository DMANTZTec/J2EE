class Base{
	String sname="ddd";
	void test() {
		System.out.println("111");
	}
}

public class Super extends Base {
String name="aaa";
int salary=2000;
public static void main(String[] args) {
	Super s = new Super();
	System.out.println(s.name);
	System.out.println(s.salary);
	System.out.println(s.sname);
	s.test();
}	
}


