package com.dmantz.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CountObjects {
	
	
	

/*Collection -> If we want represent a group of  objects as a single entity then we should go for Collection.

Steram ->If we want Process objects from the collection then we should go for Stream.

Filter ->To filter some elements based on some condition then we should go for FIlter.

count ->count method gives  how many objects are there in the streams based on condition.
*/
	
	public static void main(String[]args) {
		
		ArrayList<Integer> marks=new ArrayList<Integer>();
		marks.add(75);
		marks.add(10);
		marks.add(40);
		marks.add(30);
		marks.add(25);
		
		System.out.println(marks);
		
		Long failedStudents=marks.stream().filter(m->m<35).count();
		
		System.out.println(failedStudents);
}
	
}
