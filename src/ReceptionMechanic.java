
public class ReceptionMechanic extends Mechanic {

	public ReceptionMechanic(String name) {
		super(name);
	}

	public void submitFolder(RepairFolder folder) {
		folder.setApproved(true);
	}
	// searchVehicle
	// registerTimeandPart

}
