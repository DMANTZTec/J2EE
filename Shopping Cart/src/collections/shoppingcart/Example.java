package collections.shoppingcart;

import java.io.*;
import java.sql.*;
import java.util.*;
import javax.swing.*;

public class Example {
	
	public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Home\\Documents\\items_test.txt"));
	    String line = null;

	    int i = 0;
	    while ((line = br.readLine()) != null) {  	
	    	System.out.println(line);
	    	i++;
	    	StringTokenizer tokenizer = new StringTokenizer(line, ",");
	    	
		    {
		    	System.out.println("ItemID = " + tokenizer.nextToken());
		    	System.out.println("ItemName = " + tokenizer.nextToken());
		    	System.out.println("ItemDescription = " + tokenizer.nextToken());
		    	System.out.println("ItemPrice = " + tokenizer.nextToken());
		    	System.out.println("ItemSubcategory = " + tokenizer.nextToken());
		    	System.out.println("ItemCategory = " + tokenizer.nextToken());
		    }
	    	while (tokenizer.hasMoreTokens())
	    	{
	    		System.out.println(tokenizer.nextToken());
	    	}
	    	
	    	while (tokenizer.hasMoreTokens())
	    	{
	    		tokenizer.nextToken();
	    	}
	    	/*
	      String[] values = line.split(",");
	      for (String str : values) {
	        System.out.println(str);
	      }
	      */
	    }
	    br.close();
	  }

}
