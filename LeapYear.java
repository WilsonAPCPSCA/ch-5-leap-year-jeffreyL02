package work;
import java.util.Scanner;
public class LeapYear {
	public static boolean isLeapYear (int year){
		if(year <= 1582){
			return false;
		}
		else if(year % 4 == 0 && year % 100 != 0){
			return true;
		}
		else if(year % 400 == 0){
			return true;
		}
		else{
			return false;
		}
	}
}
