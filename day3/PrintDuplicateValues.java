package week1.day3;
import java.util.Iterator;

public class PrintDuplicateValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
int length = arr.length ;
int count=0;
for (int i = 0; i < length; i++) {
for (int j = i+1; j < length; j++) {
	if (arr[i]==arr[j]) {
			System.out.println("Duplicate values are:" +arr[i]);
			
			count ++;
			break;		
	}		
}
}
}
}
