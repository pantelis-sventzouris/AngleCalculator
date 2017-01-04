package gr.pantelis;

/**this project is about to show the angle created between the hour and minutes index in a clock.

e.g. if the clock displays 10:35, we want to display the equivalent angle (which equals to 90 degrees).
**/

import java.util.Scanner;

public class ShowAngle
{
	//tests the application
	public static void main(String[] argv)
	{
		ShowAngle app = new ShowAngle();
		
		int h = app.customizeHour(10);		//enter the hour value
		int min = app.customizeMins(35);	//enter the minutes value
		
		h = app.calcHour(h);
		min = app.calcMins(min);
		
		int angle = app.calcAngle(h, min);
		
		System.out.println(angle);
	}
	
	//converts to an appropriate hour value
	public int customizeHour(int h)
	{
		while(h<0 && h>=24)
		{
			h = getNumber();
		}
		
		h = getHour(h);
		
		return h;
	}
	
	//converts to an appropriate minute value
	public int customizeMins(int min)
	{
		while(min<0 && min>=60)
		{
			min = getNumber();
		}
		
		return min;
	}
	
	//converts the hour value to the equivalent hour angle value
	public int calcHour(int h)
	{
		return 30*h;
	}
	
	//converts the hour value to the equivalent hour angle value
	public int calcMins(int min)
	{
		return 6*min;
	}
	
	//calculates the total angle of the hour and minutes indexes
	public int  calcAngle(int h, int min)
	{
		int result = (int) Math.abs(h-min);
		result = customizeAngle(result);
		
		return result;
	}
	
	//converts an angle to 0-180 degrees space
	public int customizeAngle(int angle)
	{
		if(angle>180)
		{
			return 360-angle;
		}
		else
		{
			return angle;
		}
	}
	
	//in case of wrong hours and minutes value entry, you have to re-enter the value
	public int getNumber()
	{
		return Integer.parseInt(new Scanner(System.in).nextLine());
	}
	
	//converts the hour to equivalent 0-12 space
	public int getHour(int h)
	{
		return h%12;
	}

}
