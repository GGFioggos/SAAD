import java.util.ArrayList;

public class Customer {
	// Attributes
	private String fullName;
	private String phoneNumber;
	private String email;
	private String address;

	private int id;

	private ArrayList<Vehicle> vehicles;
	private static ArrayList<Customer> customerCatalog;

	// Constructor
	public Customer(String fullName, String phoneNumber, String email, String address) {
		this.fullName = fullName;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.address = address;
		this.vehicles = new ArrayList<Vehicle>();
		
		addToCatalog(this);
	}

	// Methods
	public static ArrayList<Customer> getCustomerCatalog() {
		return customerCatalog;
	}

	public int getCustomerId() {
		return id;
	}

	public void addToCatalog(Customer customer) {
		customerCatalog.add(customer);
	}

	public void printCustomer() {
		System.out.println("Customer Data:");
		System.out.println("Full Name: " + fullName);
		System.out.println("Phone Number: " + phoneNumber);
		System.out.println("Email: " + email);
		System.out.println("Address: " + address);
	}

	public String getEmail() {
		return email;
	}
}
