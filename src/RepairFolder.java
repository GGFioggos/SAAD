import java.util.ArrayList;

public class RepairFolder {

	// Attributes
	private int id;
	private ArrayList<ReplacementPart> replacementParts = new ArrayList<>();
	private boolean isCompleted;
	private String estimatedTime;
	private boolean isApproved;
	private String actualTime;
	private Vehicle vehicle;
	private Customer customer;

	private ArrayList<Task> tasks = new ArrayList<>();

	private static ArrayList<RepairFolder> repairFolderCatalog;

	// Constructor
	public RepairFolder() {

		// Default initialization
		isCompleted = false;
		isApproved = false;
	}

	// Methods
	public static ArrayList<RepairFolder> getRepairFolderCatalog() {
		return repairFolderCatalog;
	}

	public int getId() {
		return id;
	}

	public void assignTask(Mechanic mechanic, Task task) {

	}

	public void addToCatalog(RepairFolder repairFolder) {
		repairFolderCatalog.add(repairFolder);
	}

	public void addReplacementPart(ReplacementPart part) {
		replacementParts.add(part);
	}

	public double getTotalCost() {
		double totalCost = 0;
		for (Task task : tasks) {
			totalCost += task.getCost();
		}
		
		for(ReplacementPart part : replacementParts) {
			totalCost+= part.getPrice();
		}

		return totalCost;
	}

	public void setCompleted(boolean completion) {
		this.isCompleted = completion;
	}

	public void addTask(Task task) {
		tasks.add(task);
	}

	public void setEstimatedTime(String time) {
		estimatedTime = time;
	}

	public void setApproved(boolean approval) {
		isApproved = approval;
	}

	public void setActualTime(String time) {
		actualTime = time;
	}

	public void emailFolder() {
		// Send folder via email
	}
	
	public void printFolder() {
		System.out.println("Duration: "+estimatedTime + "  Total Cost: "+ getTotalCost() +"$");
	}

}
