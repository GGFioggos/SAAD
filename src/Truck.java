
public class Truck extends Vehicle{
	private int usefulLoad;

	public Truck(String licensePlate, String model, int year, String manufacturer, int usefulLoad) {
		super(licensePlate, model, year, manufacturer);
		this.usefulLoad = usefulLoad;
	}
	
	public void printVehicle() {
		super.printVehicle();
		System.out.println("UsefulLoad: " + usefulLoad);
	}

}
