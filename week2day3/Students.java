package week2day3;

public class Students {

	public void getStudentInfo(int id) 
	{
System.out.println("Student id is " +id);
	}
	public void getStudentInfo(int id ,String name) 
	{
		System.out.println("Student name is "  +name+   " and Student id " +id);
	
	}
	public void getStudentInfo(double number,String email) {
		System.out.println("The email id is "  +email+ " and the number of the student is " +number);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students s=new Students();
		s.getStudentInfo(5268);
		s.getStudentInfo(12345, "Abi");
		s.getStudentInfo(629587304,"abinaya123@gmail.com");
	}
}
