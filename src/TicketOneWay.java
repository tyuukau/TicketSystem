public class TicketOneWay extends Ticket 
{
    private Station startStation;
    private Station endStation;

    public TicketOneWay(Station startStation, Station endStation)
    {
        super();
        this.startStation = startStation;
        this.endStation = endStation;
        this.cost = setCost(startStation, endStation);
    }

    private double setCost(Station startStation, Station endStation) {
        double distance = endStation.getDistanceFromStartingStation() - startStation.getDistanceFromStartingStation();
        return distance <= 5 ? 1.9 : 1.9 + ((int)((distance - 5) / 2) * 2 + ((distance - 5) % 2) == 0 ? 0 : 2) * 0.2;
    }

    public String toString() 
    {
        return "One Way Ticket. From " + this.startStation + " to " + this.endStation + ". Cost: " + this.cost;
    }
    
}
