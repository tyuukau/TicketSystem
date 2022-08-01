public class TicketTwentyFourHour extends Ticket {

    private static final double DEFAULT_COST = 8.5;

    public String toString() {
        return this.type + ". Cost: " + this.cost;
    }

    public TicketTwentyFourHour() {
        this.cost = DEFAULT_COST;
        this.type = "24h Ticket";
    }

}
