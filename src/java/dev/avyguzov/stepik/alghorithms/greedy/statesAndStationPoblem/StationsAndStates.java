package dev.avyguzov.stepik.alghorithms.greedy.statesAndStationPoblem;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * Optimal set of stations with given count of states.
 *
 * @author Aleksandr Vyguzov
 */
public class StationsAndStates {
    ArrayList<Station> resultStations = new ArrayList<>();
    Set<Station> chosen;
    
    public ArrayList<Station> start(ArrayList<Station> stations, Integer count) {
        while (count < 0) {
            chooseStations(stations);
            count--;
        }
        return resultStations;
    }

    public void chooseStations(ArrayList<Station> stations) throws Error {
        if (stations.size() == 0) throw new Error("No stations");
        Station chosenStation = stations.get(0);
        int maxDifferentStates = 0;
        for (Station station : stations) {
            Set<String> currentSet = new HashSet<>(station.coveredStates);
            Set<String> maxSet = new HashSet<>(chosenStation.coveredStates);
            currentSet.removeAll(maxSet);
            if (currentSet.size() > maxDifferentStates) {
                chosenStation = station;
                maxDifferentStates = currentSet.size();
            }
        }
        chosen.add(chosenStation);
    }
}

