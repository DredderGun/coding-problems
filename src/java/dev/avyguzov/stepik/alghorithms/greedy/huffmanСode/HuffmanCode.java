package dev.avyguzov.stepik.alghorithms.greedy.huffmanСode;

import java.util.*;

public class HuffmanCode {

    static class Node {
        public String name;
        public ArrayList<Node> childs = new ArrayList<>();
        public int frequency;
        public String code;
    }

    static class NodeComparator implements Comparator<Node> {
        public int compare(Node node1, Node node2) {
            return Integer.compare(node1.frequency, node2.frequency);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        HuffmanCode mainObj = new HuffmanCode(s.nextLine());
        Map<String, Node> lettersInfo = mainObj.getLettersInfo();
        String codedString = mainObj.getCodedString();
        System.out.println(lettersInfo.size() + " " + codedString.length());
        lettersInfo.forEach((String key, Node node) -> System.out.println(key + ": " + node.code));
        System.out.println(codedString);
    }

    private final String codingString;
    private Map<String, Node> lettersInfo = new HashMap<>();
    private Node treeRoot;

    public HuffmanCode(String codingString) {
        this.codingString = codingString;
        try {
            setLettersInfo();
            buildTree();
            if (treeRoot.childs.size() == 0) {
                updateLetterCode(treeRoot, "0");
            } else {
                codeLetters(treeRoot, "");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void setLettersInfo() {
        for (String letter : codingString.split("")) {
            lettersInfo.compute(letter, (String k, Node node) -> {
                if (node == null) {
                    node = new Node();
                    node.name = k;
                    node.frequency = 1;
                } else {
                    node.frequency++;
                }
                return node;
            });
        }
    }

    protected void buildTree() {
        PriorityQueue<Node> nodesQueue = new PriorityQueue<>(new NodeComparator());
        nodesQueue.addAll(lettersInfo.values());
        Node newNode;
        while (nodesQueue.size() > 1) {
            Node firstNode = nodesQueue.poll();
            Node secondNode = nodesQueue.poll();
            newNode = new Node();
            newNode.name = "";
            newNode.frequency = firstNode.frequency + secondNode.frequency;
            newNode.childs.add(0, firstNode);
            newNode.childs.add(1, secondNode);
            nodesQueue.add(newNode);
        }
        treeRoot = nodesQueue.poll();
    }

    protected void codeLetters(Node currNode, String currCode) throws Exception {
        if (currNode.childs.size() == 0) {
            if (lettersInfo.get(currNode.name) == null) {
                throw new Exception("Key: " + currNode.name + " equals null");
            }
            updateLetterCode(currNode, currCode);
        } else {
            codeLetters(currNode.childs.get(0), currCode + "0");
            codeLetters(currNode.childs.get(1), currCode + "1");
        }
    }

    protected void updateLetterCode(Node givenNode, String code) {
        lettersInfo.computeIfPresent(givenNode.name, (String k, Node node) -> {
            node.code = code;
            return node;
        });
    }

    public Map<String, Node> getLettersInfo() {
        return lettersInfo;
    }

    public String getCodedString() {
        StringBuilder resultString = new StringBuilder();
        for (int i = 0; i < codingString.length(); i++) {
            String currLetter = codingString.substring(i, i + 1);
            resultString.append(lettersInfo.get(currLetter).code);
        }
        return resultString.toString();
    }
}
