public class TicketTwentyFourHour extends Ticket 
{
    public String toString() {
        return "24h Ticket. Cost: " + this.cost;
    }

    public TicketTwentyFourHour() 
    {
        this.cost = 8.5;
    }

}
