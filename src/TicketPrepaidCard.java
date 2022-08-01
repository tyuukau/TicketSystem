public class TicketPrepaidCard extends Ticket {
    private static final double DEPOSIT = 16;
    private double balance = 5;

    public String toString() {
        return this.type + ". Balance: " + balance + ". Cost: " + this.cost;
    }

    public TicketPrepaidCard() {
        this.cost = this.balance + DEPOSIT;
        this.type = "Prepaid Card";
    }

    public TicketPrepaidCard(double balance) {
        this.balance = balance;
        this.cost = this.balance + DEPOSIT;
        this.type = "Prepaid Card";
    }

}
