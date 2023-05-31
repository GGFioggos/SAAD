import java.util.ArrayList;

public class Vehicle {
	private String licensePlate;
	private String model;
	private int year;
	private String manufacturer;
	static ArrayList<Vehicle> vehiclesCatalog = new ArrayList<>();

	public Vehicle(String licensePlate, String model, int year, String manufacturer) {
		this.licensePlate = licensePlate;
		this.model = model;
		this.year = year;
		this.manufacturer = manufacturer;
	}

	public String getLicensePlate() {
		return licensePlate;
	}

	public static ArrayList<Vehicle> getVehiclesCatalog() {
		return vehiclesCatalog;
	}

	public void addtoCatalog(Vehicle vehicle) {
		vehiclesCatalog.add(vehicle);
	}
	
	public void printVehicle() {
		System.out.println("This vehicle has the following data:");
		System.out.println("License Plate : " + licensePlate);
		System.out.println("Model: " + model);
		System.out.println("Year: " + year);
		System.out.println("Manufacturer: " + manufacturer);
	}
}
