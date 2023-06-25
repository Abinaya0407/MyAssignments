package week1.day3;

import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) 
	{
int[] data = { 3,2,11,4,6,7};
Arrays.sort(data);
int length = data.length;
int datavalue=data[length-2];
System.out.println(data[4]);

	}
}
