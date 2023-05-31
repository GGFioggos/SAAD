import java.util.ArrayList;

public class Task {
	private String name;
	private double cost;
	private ArrayList<Task> tasksCatalog = new ArrayList<>();

	public double getCost() {
		return cost;
	}
}
