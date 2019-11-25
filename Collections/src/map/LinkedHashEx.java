package map;

import java.util.LinkedHashMap;

public class LinkedHashEx {
public static void main(String args[])
{
	LinkedHashMap<String ,Integer> lm =new LinkedHashMap<String,Integer>();
	lm.put("aaa",100);
	lm.put("bbb",101);
	lm.put("ccc",102);
	System.out.println(lm.keySet()+"  "+lm.values());
	System.out.println(lm.entrySet());
	lm.remove("aaa");
	System.out.println(lm);
	
	
}
}
