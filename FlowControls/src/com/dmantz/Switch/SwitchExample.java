package com.dmantz.Switch;

public class SwitchExample {
	
	/*->Inside switch both case and default are optional
	
	->With in switch every statement should be under some case or default i.e independent statements are
	not allowed inside switch.
	
	Caselabel:
    - case label must be compile time constants.
    - case label must be in the range of switch argument.
    - case label can be expression also (only constant expression).
    - Duplicates are not allowed.
        
    default case:
    - In the switch statement we can place default case any where but it is convention to take
      default case always at least.
      
      */
	
	public static void main (String[] args){
		
		int x=10;
		
		 final int y=20;
		
		switch(x) {
		case 1:
			System.out.println("Searching Started");
			break;
		case 10:
			System.out.println("Value is Matched");
			break;
		case y:
			System.out.println("Second value Matched");
			break;
			default:
				System.out.println("This is default");
		
		
		
		}
		
		
		
	}

}
