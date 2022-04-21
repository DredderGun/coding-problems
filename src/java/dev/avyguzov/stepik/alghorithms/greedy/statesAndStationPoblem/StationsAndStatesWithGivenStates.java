package dev.avyguzov.stepik.alghorithms.greedy.statesAndStationPoblem;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * Greedy algorithm. Optimal set of stations with best cover of given states.
 *
 * @author Aleksandr Vyguzov
 */
public class StationsAndStatesWithGivenStates {
    List<Station> resultStations = new ArrayList<>();

    public List<Station> start(final List<Station> stations, final List<String> states) {
        List<Station> cloneStations = new ArrayList<>(stations);
        List<String> cloneStates = new ArrayList<>(states);
        while (cloneStates.size() != 0 && cloneStations.size() != 0) {
            Station chosenStation = chooseStations(cloneStations, cloneStates);
            if (chosenStation != null) {
                resultStations.add(chosenStation);
                cloneStates.removeAll(chosenStation.coveredStates);
                cloneStations.remove(chosenStation);
            } else {
                break;
            }
        }
        return resultStations;
    }

    /**
     * Method chooses a set which contains the largest number of uncovered required elements.
     *
     * @param  stations It is stations where method .
     * @param  requiredStates states which must be in the cover.
     * @return set which contains the largest number of uncovered elements.
     */
    protected Station chooseStations(final List<Station> stations, final List<String> requiredStates) throws Error {
        if (stations.size() == 0 || requiredStates.size() == 0) throw new Error("No stations or states");
        Station chosenStation = stations.get(0);
        int maxDifferentStates = 0;
        for (Station station : stations) {
            Set<String> currentSet = new HashSet<>(station.coveredStates);
            Set<String> requiredStatesSet = new HashSet<>(requiredStates);
            currentSet.retainAll(requiredStatesSet);
            if (currentSet.size() > maxDifferentStates) {
                chosenStation = station;
                maxDifferentStates = currentSet.size();
            }
        }
        return chosenStation;
    }
}
