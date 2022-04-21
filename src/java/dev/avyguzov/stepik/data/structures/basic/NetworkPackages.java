package dev.avyguzov.stepik.data.structures.basic;

import java.util.*;

/**
 * https://stepik.org/lesson/41234/step/3?unit=19818
 *
 * Громоздко. Переделать короче
 */
public class NetworkPackages {
    static class Pack {
        int startTime;
        int endTime;
        int timeForExec;

        public Pack(int timeForExec) {
            this.timeForExec = timeForExec;
        }
    }

    public static class FixedSizeQueue extends LinkedList<Pack> {
        private final int maxSize;

        public FixedSizeQueue(int size) {
            maxSize = size;
        }

        @Override
        public boolean add(Pack el) {
            if (this.size() >= maxSize) {
                return false;
            }
            return super.add(el);
        }
    }

    private void checkQueueAndRemove(FixedSizeQueue queue, int currTime) {
        while (queue.peekFirst() != null && queue.peekFirst().endTime <= currTime) {
            queue.removeFirst();
        }
    }

    public String solution(HashMap<Integer, List<Pack>> packages, int capacity) {
        var queue = new FixedSizeQueue(capacity);

        for (Map.Entry<Integer, List<Pack>> entry : packages.entrySet()) {
            var currTime = entry.getKey();
            var receivedPacksPerTime = entry.getValue();

            checkQueueAndRemove(queue, currTime);

            receivedPacksPerTime.forEach(pack -> {
                Pack lastPack = queue.peekLast();
                if (queue.add(pack)) {
                    if (lastPack != null) {
                        pack.startTime = lastPack.endTime;
                        pack.endTime = lastPack.endTime + pack.timeForExec;
                    } else {
                        pack.startTime = currTime;
                        pack.endTime = currTime + pack.timeForExec;
                    }
                } else {
                    pack.startTime = -1;
                }
                checkQueueAndRemove(queue, currTime);
            });
        }

        var s = new StringBuilder();
        for (Map.Entry<Integer, List<Pack>> packs : packages.entrySet()) {
            for (Pack pack : packs.getValue()) {
                s.append(pack.startTime).append("\n");
            }
        }

        return s.toString().strip();
    }

    public static void main(String[] args) {
        var packages = new HashMap<Integer, List<Pack>>();
        Scanner in = new Scanner(System.in);
        NetworkPackages np = new NetworkPackages();

        int capacity = in.nextInt();
        int packagesCount = in.nextInt();

        while (packagesCount > 0) {
            int time = in.nextInt();
            int timeForExecution = in.nextInt();
            packages.compute(time, (key, oldValue) -> {
                List<Pack> packs;
                if (oldValue == null) {
                    packs = new ArrayList<>();
                } else {
                    packs = oldValue;
                }
                packs.add(new Pack(timeForExecution));
                return packs;
            });
            packagesCount--;
        }
        System.out.println(np.solution(packages, capacity));
    }
}
