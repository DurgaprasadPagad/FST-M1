
public class Car {

	int make;
	String color;
	String transmission;
	int tyres;
	int doors;
	
	Car(){
		tyres=4;
		doors=4;
	}

	public void displayCharacterstics() {
		// TODO Auto-generated method stub
		System.out.println("Name of the car is Lexus");
		System.out.println("Make of the car: "+make);
		System.out.println("Color of the car: "+color);
		System.out.println("Type of transimission of the car: "+transmission);
		System.out.println("Number of tyres of the car: "+tyres);
		System.out.println("Number of doors of the car: "+doors);
		
	}

	public void accelerate() {
		// TODO Auto-generated method stub
		System.out.println("Car is moving forward.");
		
	}

	public void brake() {
		// TODO Auto-generated method stub
		System.out.println("Car stopped moving.");
		
	}

}
