package Demo;

import org.junit.jupiter.api.Test;

public class SetAndGet {
	
	private int h,m,s;
	
	public String test() {
		
		return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
	}
	
	public SetAndGet() {
		this(0,0,0);
	}
	
	public SetAndGet(int h) {
		this(h,0,0);
	}
	
	public SetAndGet(int h,int m) {
		this(h,m,0);
	}
	
	public SetAndGet(int h ,int m, int s) {
		setTime(h,m,s);
	}
	
	public void setTime(int h, int m, int s) {
		
		setHour(h);
		setMinute(m);
		setSecond(s);
	}
	
	public void setHour(int h) {
		
		this.h = ((h>=0 && h<24) ? h : 0);
	}

	public void setMinute(int m) {
		
		this.m = ((m>=0 && m<60) ? m : 0);
	}
	
	public void setSecond(int s) {
		
		this.s = ((s>=0 && s<60) ? s : 0);
	}
	
	public int getHour() {
		
		return h;
	}
	
	public int getMinute() {
		
		return m;
	}
	
	public int getSecond() {
		
		return s;
	}


}
