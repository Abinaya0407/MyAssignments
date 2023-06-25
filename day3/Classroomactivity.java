package week1.day3;

import java.util.Arrays;

public class Classroomactivity {

	public static void main(String[] args) {
int[] number= {2,5,7,7,5,9,2,3};
Arrays.sort(number);
for (int i = 0; i < number.length-1; i++) {
	if (number[i]==number[i+1]) 
	{
		System.out.println("The duplicate values are" +number[i+1]);
	}
	
}
	}

}
