import java.util.ArrayList;

public class Task {
	static ArrayList<Task> tasksCatalog = new ArrayList<>();
	
	// Attributes
	private String name;
	private double cost;
	
	// Constructor
	public Task(String name,double cost) {
		this.name = name;
		this.cost = cost;
	}	
	
	// Methods
	public double getCost() {
		return cost;
	}
	
	public String getName() {
		return name;
	}

	public ArrayList<Task> getSupportedTasksCatalog() {
		return tasksCatalog;
	}

}