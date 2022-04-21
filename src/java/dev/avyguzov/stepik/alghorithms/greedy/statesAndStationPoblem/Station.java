package dev.avyguzov.stepik.alghorithms.greedy.statesAndStationPoblem;

import java.util.List;

public class Station {
    public String name;
    public List<String> coveredStates;

    public Station(String name, List<String> coveredStates) {
        this.name = name;
        this.coveredStates = coveredStates;
    }
}
