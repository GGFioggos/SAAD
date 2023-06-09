import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Appointment {
	// Attributes
	private String date;
	private String time;
	private String phoneNumber;
	private int id;

	private static ArrayList<Appointment> appointmentCatalog;

	// Constructor
	public Appointment(String date, String time, String phoneNumber) {
		this.date = date;
		this.time = time;
		this.phoneNumber = phoneNumber;

		addToCatalog(this);
	}

	// Methods
	public static ArrayList<Appointment> getAppointmentCatalog() {
		return appointmentCatalog;
	}

	public ArrayList<Appointment> getAvailableAppointments(String date) {
		// Return available appointments
		int randomNum = ThreadLocalRandom.current().nextInt(1, 11);
		if (randomNum % 2 == 0) {
			return Appointment.getAppointmentCatalog();
		}
		
		System.out.println("No available appointments");
		return null;
	}

	public int getId() {
		return id;
	}

	public void addToCatalog(Appointment appointment) {
		appointmentCatalog.add(appointment);
	}

}
