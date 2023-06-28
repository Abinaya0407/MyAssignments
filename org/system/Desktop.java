package org.system;

public class Desktop extends Computer{

	public void desktopSize()
	{
		System.out.println("Size of the desktop is 12 inches");
	}
	public static void main(String[] args) 
	{
		Desktop d =new Desktop();
		d.desktopSize();
		d.computerModel();
		
	}
}
