
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

	// registerReplacementPart
}
