public abstract class Ticket {
    protected double cost;
    protected String type;

    public double getCost() {
        return this.cost;
    }

    public abstract String toString();

    public Ticket() {
    }

}
