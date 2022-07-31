public abstract class Ticket 
{  
    protected double cost;
    
    public double getCost() 
    {
        return this.cost;
    }

    public abstract String toString();

    public Ticket() 
    {
    }

}
