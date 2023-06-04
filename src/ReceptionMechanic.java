import java.util.ArrayList;

public class ReceptionMechanic extends Mechanic {

	public ReceptionMechanic(String name) {
		super(name);
	}

	public void submitFolder(RepairFolder folder) {
		folder.setApproved(true);
	}
	
	public Vehicle searchVehicle(String licencePlate) {
		ArrayList<Vehicle> vehicles = Vehicle.getVehiclesCatalog();
		
		for (Vehicle vehicle: vehicles) {
			if (vehicle.getLicensePlate() == licencePlate) {
				return vehicle;
			}
		}
		System.out.println("No vehicle found!");
		return null;
	}
	
	public void registerTimeAndPart(RepairFolder folder, ReplacementPart part, int quantity, String time) {
		folder.setEstimatedTime(time);
		
		for (int i = 0; i < quantity; i++) {
			folder.addReplacementPart(part);
		}
	}
}
