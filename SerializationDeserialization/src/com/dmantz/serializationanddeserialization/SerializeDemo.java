package com.dmantz.serializationanddeserialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeDemo {
	
	//Serialization The Process of Saving an object to a file is called serialization
	
	public static void main(String []args) {
		
		Person p=new Person("SanthoshReddy",30,"50000");
		
		try {
			FileOutputStream fos=new FileOutputStream("	abc.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(p);
			oos.close();
			fos.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	

}
