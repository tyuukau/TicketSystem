import java.util.ArrayList;

public class Cart {
	private ArrayList<Ticket> ticketsOrdered = new ArrayList<Ticket>();

	public void addTicket(Ticket ticket) {
		this.ticketsOrdered.add(ticket);
	}

	public double totalCost() {
		double cost = 0.0;
		for (Ticket ticket : this.ticketsOrdered) {
			cost += ticket.getCost();
		}
		return cost;
	}

	public void print() {
		System.out.println("Cart:");
		for (Ticket ticket : this.ticketsOrdered) {
			System.out.println(".\t" + ticket.toString());
		}
		System.out.println("Total cost: " + "$" + this.totalCost());
		System.out.println("\n");
	}

	public void empty() {
		this.ticketsOrdered.clear();
	}

}
