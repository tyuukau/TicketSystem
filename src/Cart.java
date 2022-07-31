import java.util.ArrayList;

public class Cart {
	private ArrayList<Ticket> ticketsOrdered = new ArrayList<Ticket>();

	public void addTicket(Ticket ticket) {
		this.ticketsOrdered.add(ticket);
	}

	public void addTicket(Ticket... tickets) {
		for (Ticket ticket : tickets) {
			this.ticketsOrdered.add(ticket);
		}
	}

	public double totalCost() {
		double cost = 0.0;
		for (Ticket ticket : this.ticketsOrdered) {
			cost += ticket.getCost();
		}
		return cost;
	}

	public void print() {
		System.out.println("********CART**************************************");
		System.out.println("Ordered Items:");
		for (int i = 0; i < this.ticketsOrdered.size(); i++) {
			System.out.println(Integer.toString(i + 1) + ".\t" + this.ticketsOrdered.get(i).toString());
		}
		System.out.println("Total cost: " + "$" + this.totalCost());
		System.out.println("**************************************************");
		System.out.println("\n");
	}

	public ArrayList<Ticket> getTicketsOrdered() {
		return this.ticketsOrdered;
	}

	public void empty() {
		this.ticketsOrdered.clear();
	}

}
