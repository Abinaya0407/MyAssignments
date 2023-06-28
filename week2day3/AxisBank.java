package week2day3;

public class AxisBank extends BankInfo{

public void deposit()
{
	System.out.println("This is over ridden");
}
 public static void main(String[] args)
 {
AxisBank aba =new AxisBank();
aba.deposit();
	}
}
