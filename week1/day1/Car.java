package week1.day1;

public class Car {
	public void drivecar() {
		System.out.println("I am driving my car");
	}
	public void applybrake() {
		System.out.println("Brakes are applied where needed");
	}
	public void soundhorn() {
		System.out.println("Check horn sound");
	}
	public void ispuncture() {
		System.out.println("Car is puncture");
	}

	public static void main(String[] args) {
		Car bmw = new Car();
		bmw.drivecar();
		bmw.applybrake();
		bmw.soundhorn();
		bmw.ispuncture();
	}
}