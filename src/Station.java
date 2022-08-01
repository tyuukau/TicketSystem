import java.util.Comparator;

public class Station {
    private String stationName;
    private double distanceFromStartingStation;

    public final static Comparator<Station> COMPARE_BY_DISTANCE = (Station s1, Station s2) -> Double
            .compare(s1.getDistanceFromStartingStation(), s2.getDistanceFromStartingStation());

    public boolean equals(Object other) {
        try {
            return (this.stationName.toLowerCase().equals(((Station) other).getStationName().toLowerCase()));
        } catch (NullPointerException | ClassCastException ex) {
            return false;
        }
    }

    public String getStationName() {
        return this.stationName;
    }

    public double getDistanceFromStartingStation() {
        return this.distanceFromStartingStation;
    }

    public String toString() {
        return "Station: " + this.stationName + ". Distance from starting station: " + this.distanceFromStartingStation;
    }

    public Station(String name, double distance) {
        this.stationName = name;
        this.distanceFromStartingStation = distance;
    }

}
