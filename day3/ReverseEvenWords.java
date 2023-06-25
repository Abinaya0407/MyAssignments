package week1.day3;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
String test = "I am a Software Tester" ;
String[] testArr =test.split("");

for (int i = 0; i < testArr.length; i++) {
	String words = t
			estArr[i];
	if (i%2 ==0) {
		char[] letters = words	.toCharArray();
		for (int  j = letters.length-1 ;j >=0; j--) 
		{
			System.out.println(letters[j]);
		}
		
		}
	else {
		System.out.println(words + "  ");
	}
}
	}

}
	