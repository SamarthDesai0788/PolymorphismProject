package basic;
//runtime
class Vehicle {
	void type() {
		System.out.println("Type of Vehicle");
	}
}
class Bike extends Vehicle{
	void type() {
		System.out.println("Type of bike");
	}
}
class Car extends Vehicle{
	void type() {
		System.out.println("Type of car");
	}
}
public class RunTime{
	public static void main(String[] args) {
		Bike B1=new Bike();
		B1.type();
		Car c=new Car();
		c.type();
	}
}

