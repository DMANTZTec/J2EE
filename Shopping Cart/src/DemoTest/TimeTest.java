package DemoTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TimeTest {

	private int h,m,s;
	
	@Test
	public void setTime(int h, int m, int s)
	{
		this.h = ((h>=0 && h<24) ? h : 0);
		this.m = ((m>=0 && m<24) ? m : 0);
		this.s = ((s>=0 && s<24) ? s : 0);
	}
	
	
	public String test() {
		return String.format("%0.2d:%0.2d:%0.2d", h, m ,s);
	}
	
	public String toString() {
		return String.format("%d:%0.2d:%0.2d %s", ((h==0 || h==12) ? 12 : h%12) ,m,s,( h<12 ? "AM" : "PM"));
	}
	
	

}
