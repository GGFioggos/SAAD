
public class SupervisingMechanic extends Mechanic {

	public SupervisingMechanic(String name) {
		super(name);
	}

	public void assignTasks(Mechanic mechanic, Task task) {
		mechanic.addTask(task);
	}

	public void completeRepairFolder(RepairFolder folder) {
		folder.setCompleted(true);
	}

	public void registerReplacementPart(RepairFolder folder, ReplacementPart part, int quantity) {
		for (int i = 0; i < quantity; i++) {
			folder.addReplacementPart(part);
		}
	}
}
