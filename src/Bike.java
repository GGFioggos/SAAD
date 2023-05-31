
public class Bike extends Vehicle{
	private int displacement;

	public Bike(String licensePlate, String model, int year, String manufacturer, int displacement) {
		super(licensePlate, model, year, manufacturer);
		this.displacement = displacement;
	}
    
	public void printVehicle() {
		super.printVehicle();
		System.out.println("Displacement: " + displacement);
	}
}
