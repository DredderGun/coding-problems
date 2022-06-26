package dev.avyguzov.stepik.data.structures.hashtables;

import java.util.LinkedList;
import java.util.Scanner;

public class ChainHashStrings {
    private final LinkedList<String>[] hashTable;

    public ChainHashStrings(int n) {
        hashTable = new LinkedList[n];
    }

    private long pow(long n, long p) {
        if (p == 0) {
            return 1L;
        }
        if (p == 1) {
            return n % 1_000_000_007;
        }
        if (p % 2 == 0) {
            return (pow(n, p / 2) * pow(n, p / 2)) % 1_000_000_007;
        } else {
            return ((n % 1_000_000_007) *
                    (pow(n, (p - 1) / 2) *
                    pow(n, (p - 1) / 2) % 1_000_000_007)) % 1_000_000_007;
        }
    }

    private int getHash(String str) {
        long resultHash = 0;
        for (int i = 0; i < str.length(); i++) {
            resultHash = (resultHash + (str.charAt(i) * pow(263, i)) % 1_000_000_007) % 1_000_000_007;
        }
        return (int) (resultHash % 1_000_000_007) % hashTable.length;
    }

    public void add(String key) {
        int hashIndex = getHash(key);
        LinkedList<String> row;
        if (hashTable[hashIndex] == null) {
            row = new LinkedList<>();
            row.push(key);
            hashTable[hashIndex] = row;
        } else if (!elementExists(key, hashTable[hashIndex])) {
            hashTable[hashIndex].push(key);
        }
    }

    private boolean elementExists(String key, LinkedList<String> row) {
        for (String s : row) {
            if (s.equals(key)) return true;
        }
        return false;
    }

    public void del(String key) {
        int hashIndex = getHash(key);
        LinkedList<String> ll = hashTable[hashIndex];
        if (ll == null) return;

        for (int i = 0; i < ll.size(); i++) {
            if (ll.get(i).equals(key)){
                ll.remove(i);
                break;
            }
        }
    }

    public String find(String key) {
        int hashIndex = getHash(key);
        LinkedList<String> row = hashTable[hashIndex];
        if (row == null) return "no";

        for (String str : row) {
            if (str.equals(key)) {
                return "yes";
            }
        }

        return "no";
    }

    public String check(int index) {
        LinkedList<String> row = hashTable[index];
        if (row == null || row.size() == 0) {
            return " ";
        }
        StringBuilder sb = new StringBuilder();
        for (String s : row) {
            sb.append(s).append(" ");
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();

        ChainHashStrings hashMap = new ChainHashStrings(m);
        String action;
        for (int i = 0; i < n; i++) {
            action = in.next();
            switch (action) {
                case ("add"):
                    hashMap.add(in.next());
                    break;
                case ("del"):
                    hashMap.del(in.next());
                    break;
                case ("find"):
                    System.out.println(hashMap.find(in.next()));
                    break;
                case ("check"):
                    System.out.println(hashMap.check(in.nextInt()));
                    break;
            }
        }
    }
}
