package map;
import java.util.*;


enum days
{
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}
public class EnumSetEx {
public static void main(String[] args) {
	
	Set<days> set = EnumSet.of(days.FRIDAY,days.MONDAY);
	Set<days> set1 = EnumSet.allOf(days.class);
	System.out.println(set1);
	Set<days> set2 = EnumSet.noneOf(days.class);
	System.out.println(set2);
	Iterator<days> itr =set.iterator();
	
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
}
}
