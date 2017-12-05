package Demo;

public enum Enum {
		
		January("31"),Feburary("28"),March("31"),April("30"),May("31"),June("30"),July("31"),
		August("31"),September("31"),October("31"),November("30"),December("31");
		
		private final String days;
		
		Enum(String days) {
			
			this.days = days;
			
		}
		
		public String getDays() {
			
			return days;
			
		}

}
