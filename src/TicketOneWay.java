public class TicketOneWay extends Ticket {
    private Station startStation;
    private Station endStation;

    public String toString() {
        return this.type + ". From " + this.startStation + " to " + this.endStation + ". Cost: " + this.cost;
    }

    public TicketOneWay(Station startStation, Station endStation) {
        super();
        this.type = "One-way Ticket";
        this.startStation = startStation;
        this.endStation = endStation;
        double distance = endStation.getDistanceFromStartingStation() - startStation.getDistanceFromStartingStation();
        this.cost = distance <= 5 ? 1.9 : 1.9 + ((int) ((distance - 5) / 2) * 2 + ((distance - 5) % 2) == 0 ? 0 : 2) * 0.2;
    }

}
