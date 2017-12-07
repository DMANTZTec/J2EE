package Demo;

public class Inheritence {
	
	public int gear,speed;
	
	public Inheritence(int gear, int speed) {
		
		this.gear = gear;
		this.speed = speed;
		
	}
	
	public void speedup(int increment) {
		
		speed += increment;
		
	}
	
	public void brake(int decrement) {
		
		speed -= decrement;
		
	}
	
	public String toString() {
		
		return "no.of gears : "+gear+"\nspeed : "+speed;
	}

}
