package dev.avyguzov.common.dynamic.londontSites;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class DynamicAlgorithmWithTable {

    static class Item {
        public Integer val;
        public Integer measuringValue;
    }

    static class NodeInResultTable {
        public Integer resultSum;
        public Integer columnVal;
        public List<Item> summers;
    }

    protected List<List<NodeInResultTable>> resultTable;
    protected Integer graduationValue = 0;
    protected List<Item> initialItems;
    protected Integer requiredVal;

    public DynamicAlgorithmWithTable(List<Item> initialItems, Integer requiredVal) {
        this.requiredVal = requiredVal;
        this.initialItems = initialItems;

        setGraduation(initialItems, requiredVal);
    }

    protected void process(List<Item> initialItems) {
        if (graduationValue < 0) throw new Error("Graduation equals null");
        if (initialItems.size() == 0) throw new Error("Graduation equals null");

        Integer countOfColumns = requiredVal / graduationValue;

        initialItems.forEach(el -> {
            ArrayList<NodeInResultTable> newList = new ArrayList<>(countOfColumns);
            List<NodeInResultTable> lastRow = resultTable.get(resultTable.size() - 1);

            for (int i = 0; i < countOfColumns; i++) {
                NodeInResultTable node = new NodeInResultTable();
                node.columnVal = graduationValue * i;
                newList.set(i, node);
                NodeInResultTable aboveRowVal = lastRow.get(i);

                if (el.measuringValue < node.columnVal && lastRow != null) {

                }
            }
            // resultTable.add();
        });
    }

    protected void setGraduation(List<Item> itemsToHandle, Integer requiredVal) {
        if (itemsToHandle.size() == 0) {
            throw new Error("Input array doesnt have items");
        }
        this.graduationValue = itemsToHandle.stream().min(Comparator.comparing(el -> el.measuringValue)).get().measuringValue;
    }
}
