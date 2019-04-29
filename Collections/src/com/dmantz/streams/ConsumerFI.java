package com.dmantz.streams;

import java.util.function.Consumer;

 class Movie{
	 
	 String name;
	 Movie(String name){
		 
		 this.name=name;
	 }
	
}

 public class ConsumerFI {
	
	public static void main(String []args) {
		
		Consumer<Movie> c1=m->System.out.println(m.name+"  Ready to release");
		Consumer<Movie> c2=m->System.out.println(m.name+"  Released but flap");
		Consumer<Movie> c3=m->System.out.println(m.name+"  Removed from theater");
		Consumer<Movie> cc=c1.andThen(c2).andThen(c3);
		
		Movie m=new Movie("Spider");
		cc.accept(m);
		
		
	}

}
