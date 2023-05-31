import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Task task1 = new Task("Oil Replacement", 20);
		Task task2 = new Task("Cabin Filter Replacement", 5);
		Task task3 = new Task("Brake Maintenance", 30);

		Task.addToCatalog(task1);
		Task.addToCatalog(task2);
		Task.addToCatalog(task3);

		ArrayList<Task> test = Task.getSupportedTasksCatalog();

		ReplacementPart part1 = new ReplacementPart("Oil Packaging", 30);
		ReplacementPart part2 = new ReplacementPart("Oil Filter", 20);
		ReplacementPart part3 = new ReplacementPart("Cabin Filter", 30);
		ReplacementPart part4 = new ReplacementPart("Front Brake", 5);
		ReplacementPart part5 = new ReplacementPart("Rear Brake", 5);
		ReplacementPart part6 = new ReplacementPart("Brake Fluid", 10);

		ArrayList<ReplacementPart> replacementParts = new ArrayList<>();

		replacementParts.add(part1);
		replacementParts.add(part2);
		replacementParts.add(part3);
		replacementParts.add(part4);
		replacementParts.add(part5);
		replacementParts.add(part6);

		RepairFolder repair1 = new RepairFolder();
		repair1.addTask(task1);
		repair1.addTask(task2);
		repair1.addReplacementPart(part1);
		repair1.addReplacementPart(part2);
		repair1.addReplacementPart(part3);
		repair1.setEstimatedTime("1 Day");

		RepairFolder repair2 = new RepairFolder();
		repair2.addTask(task3);

		for (int i = 0; i < 4; i++) {
			repair2.addReplacementPart(part4);
			repair2.addReplacementPart(part5);
		}

		repair2.addReplacementPart(part6);
		repair2.setEstimatedTime("2 Days");

		for (Task x : Task.getSupportedTasksCatalog()) {
			x.printTask();
		}

		System.out.println("----------------------------------------------------------");

		for (ReplacementPart x : replacementParts) {
			x.printReplacementPart();
		}
		
		System.out.println("----------------------------------------------------------");
		
		repair1.printFolder();
		
		System.out.println("----------------------------------------------------------");
		
		repair2.printFolder();

	}

}
