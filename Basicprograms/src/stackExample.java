import java.util.Iterator;
import java.util.Stack;

public class stackExample {
public static void main(String[] args)
{
	Stack<Integer> st = new Stack<Integer>();
	st.push(1);
	st.push(4);
	st.push(3);
	st.push(2);
    st.pop();
	Iterator<Integer> itr = st.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
		
	
}
}
