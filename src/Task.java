import java.util.ArrayList;

public class Task {
	static ArrayList<Task> tasksCatalog = new ArrayList<>();

	private String name;
	private double cost;

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
