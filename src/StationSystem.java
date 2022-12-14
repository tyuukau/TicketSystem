import java.util.ArrayList;
import java.util.Collections;

public class StationSystem {
    private ArrayList<Station> listOfStations = new ArrayList<Station>();

    public void addStation(Station station) {
        if (listOfStations.contains(station)) {
            System.out.println("The station is already in the list of stations.");
        } else {
            this.listOfStations.add(station);
            Collections.sort(this.listOfStations, Station.COMPARE_BY_DISTANCE);
        }
    }

    public Station searchStation(String title) {
        for (Station station : this.listOfStations) {
            if (station.getStationName().equalsIgnoreCase(title)) {
                return station;
            }
        }
        return null;
    }

    public void print() {
        System.out.println("Station System:");
        for (Station station : listOfStations) {
            System.out.println(station.toString());
        }
        System.out.println("\n");
    }

    public StationSystem() {
    }

    public StationSystem(Station... list) {
        for (Station station : list) {
            if (this.listOfStations.contains(station)) {
                System.out.println("'" + station.getStationName() + "' is already in the system.");
            } else {
                this.listOfStations.add(station);
                System.out.println("'" + station.getStationName() + "' is added to the system.");
            }
        }
        Collections.sort(this.listOfStations, Station.COMPARE_BY_DISTANCE);
    }

}
