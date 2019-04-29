package com.dmantz.streams;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/*
*Function->Function is the predefined interface ,
Take Some input and perform some operation and returns the result,
which is need not to be boolean type.

Function->apply()
 
*Predicate->Predicate is the predefined functional interface,
Take Some input and perform some conditional check and returns boolean value.

Predicate->test()

*Consumer->Consumer is the is the predefined functional interface,
Accept Some input and perform required operation  and not required to return anything.

Consumer-accept()

*Supplier:Just supply my required objects and it wont take any input.

Supplier->get()

*/
class Student {
	
	
	 String name;
	 int marks;
	 Student(String name,int marks){
		 this.name=name;
		 this.marks=marks;
		 
	 }
	 

	}


public class PredicateFunctionConsumer {
	
	public static void main(String [] args) {
		
		Function<Student,String> f=s->{
			
			int marks=s.marks;
			String grade="";
			if(marks>80) grade="A[Dictiction]";
			if(marks>60) grade="B[First Class]";
			if(marks>50) grade="C[Second Class]";
			if(marks>35) grade="D[Third Class]";
			        else grade="E[Failed]";
			return grade;
			
		};
		
		Predicate<Student> p=s->s.marks>=60;
		
		Consumer<Student> c=s1->
		{
		System.out.println("Student Name:"+s1.name);
		System.out.println("Student marks:"+s1.marks);
		System.out.println("Student Grade:"+f.apply(s1));
		System.out.println();
			
		};
		
		Student[] s= {new Student("Santhosh",100),
				new Student("Naresh",65),
				new Student("Sai",55),
				new Student("Ramesh",45),
				new Student("Prasad",25)
		};
		
		for(Student s1:s) {
			
			if(p.test(s1)) {
				c.accept(s1);
			}
		}
		
		
	}
	
	

}
