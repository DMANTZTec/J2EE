package com.dmantz.serializationanddeserialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeDemo {
	
	public static void main(String []args) {
		
		//DeSerialization The process of reading an object from a file is called deserialization
		
		
		FileInputStream fis;
		ObjectInputStream ois;
		try {
			fis = new FileInputStream("C:\\Users\\sony\\santhosh\\abc.txt");
			ois=new ObjectInputStream(fis);
			Person p=(Person)ois.readObject();
			System.out.println("Name= "+p.getName());
			System.out.println("Age ="+p.getAge());
			System.out.println("Salary ="+p.getSalary());
			ois.close();
			fis.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
