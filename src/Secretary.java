
public class Secretary {
	// Attributes
	private int phoneNumber;
	private String fullName;

	// Constructor
	public Secretary(int phoneNumber, String fullName) {
		this.phoneNumber = phoneNumber;
		this.fullName = fullName;
	}

	// Methods
	public void createCustomer(String fullName, String phoneNumber, String email, String address) {
		new Customer(fullName, phoneNumber, email, address);
	}

	public void createVehicle(String licensePlate, String model, int year, String manufacturer) {
		new Vehicle(licensePlate, model, year, manufacturer);
	}

	public void createAppointment(String date, String time, String phoneNumber) {
		new Appointment(date, time, phoneNumber);
	}
}
