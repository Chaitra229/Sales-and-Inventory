package com.sales.genericutilities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class JavaUtils {
/**
 * This method will get the random numbers to append with the value
 * @param range
 * @return
 */
public int getRandomNo(int range)
{
	Random ran=new Random();
	int random = ran.nextInt(range);
	return random;
}
/**
 * This method will get the current system date
 * @return
 */
public String getSystemDate()
{
	Date dt = new Date();
	String date = dt.toString();
	return date;
}
/**
 * This method will allow us to give the required date format
 * @param format
 * @return
 */
public String systemDateFormat(String format)
{
	SimpleDateFormat date_format = new SimpleDateFormat(format);
	Date dt=new Date();
	String date = date_format.format(dt);
	return date;
}
}
