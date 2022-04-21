package dev.avyguzov.stepik.alghorithms.task43;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * The problem <a href="https://stepik.org/lesson/13240/step/8?unit=3426">https://stepik.org/lesson/13240/step/8?unit=3426</a>
 *
 * Heap date structure
 */
public class PriorityQueueAlg {
    private final ArrayList<Integer> heapArray = new ArrayList<>();
    private int childrenNodeIndex1 = 1;
    private int childrenNodeIndex2 = 2;
    private int parentIndex = 0;

    public static void main(String[] args) {
        PriorityQueueAlg alg = new PriorityQueueAlg();
        Scanner s = new Scanner(System.in);
        int operationsCount = s.nextInt();
        String instruction;
        while (operationsCount != 0) {
            if (s.hasNextLine()) {
                instruction = s.next();
                if (instruction.charAt(0) == 'I') {
                    alg.addNewEl(s.nextInt());
                } else if (instruction.charAt(0) == 'E') {
                    System.out.println(alg.extractMax());
                }
                operationsCount--;
            }
        }
        s.close();
    }

    public void addNewEl(Integer newEl) {
        heapArray.add(newEl);
        liftNodeUp();
    }

    private void liftNodeUp() {
        int currentIndex = heapArray.size() - 1;
        while (currentIndex != 0) {
            updateParentIndex(currentIndex);
            if (heapArray.get(parentIndex) < heapArray.get(currentIndex)) {
                Collections.swap(heapArray, parentIndex, currentIndex);
                currentIndex = parentIndex;
            } else {
                break;
            }
        }
    }

    public Integer extractMax() {
        int elToReturn = heapArray.get(0);
        parentIndex = 0;
        changeRootElement();
        updateChildNodesIndexes();
        siftNodeDown();
        return elToReturn;
    }

    private void siftNodeDown() {
        while (childrenNodeIndex1 < heapArray.size()) {
            boolean wasSwap;
            if (childrenNodeIndex2 < heapArray.size() &&
                    heapArray.get(childrenNodeIndex2) > heapArray.get(childrenNodeIndex1)) {
                wasSwap = compareAndSwapParentAndChild(childrenNodeIndex2);
            } else {
                wasSwap = compareAndSwapParentAndChild(childrenNodeIndex1);
            }
            if (!wasSwap) {
                break;
            }
        }
    }

    private void changeRootElement() {
        Collections.swap(heapArray, 0, heapArray.size() - 1);
        heapArray.remove(heapArray.size() - 1);
    }
    
    private boolean compareAndSwapParentAndChild(int childrenNodeIndex) {
        if (childrenNodeIndex >= heapArray.size() || heapArray.get(childrenNodeIndex) <= heapArray.get(parentIndex)) {
            return false;
        }
        Collections.swap(heapArray, childrenNodeIndex, parentIndex);
        parentIndex = childrenNodeIndex;
        updateChildNodesIndexes();
        return true;
    }

    private void updateChildNodesIndexes() {
        this.childrenNodeIndex1 = this.parentIndex * 2 + 1;
        this.childrenNodeIndex2 = this.parentIndex * 2 + 2;
    }

    private void updateParentIndex(int childIndex) {
        this.parentIndex = (int) Math.floor((childIndex - 1) / 2.0);
    }
}
