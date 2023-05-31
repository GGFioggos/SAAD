
public class ReplacementPart {
	private String name;
	private int price;

	public ReplacementPart(String name, int price) {
		this.name = name;
		this.price = price;
	}
	

	public int getPrice() {
		return price;
	}


	public void printReplacementPart() {
		System.out.println("Name: " + name + "  Price: " + price + "$");
	}
}
