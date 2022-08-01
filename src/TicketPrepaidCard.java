public class TicketPrepaidCard extends Ticket {
    private final double DEPOSIT = 16;
    private double balance = 5;

    public String toString() {
        return "Prepaid Card. Balance: " + balance + ". Cost: " + this.cost;
    }

    public TicketPrepaidCard() {
        this.cost = this.balance + this.DEPOSIT;
    }

    public TicketPrepaidCard(double balance) {
        this.balance = balance;
        this.cost = this.balance + this.DEPOSIT;
    }

}
