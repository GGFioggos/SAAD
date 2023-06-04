import java.util.ArrayList;

public class Mechanic {
	private String name;
	private static ArrayList<Mechanic> MechanicCatalog = new ArrayList<Mechanic>();
	private static ArrayList<Task> tasks = new ArrayList<Task>();

	public Mechanic(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public static ArrayList<Mechanic> getMechanicCatalog() {
		return MechanicCatalog;
	}

	public void addTask(Task aTask) {
		tasks.add(aTask);
	}

}
