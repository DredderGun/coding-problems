package dev.avyguzov.stepik.data.structures.hashtables;

import java.io.*;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

class MyReader {
    private BufferedReader reader;
    private StringTokenizer tokenizer = null;
    MyReader(Reader r) {
        reader = new BufferedReader(r);
    }
    public int nextInt() throws IOException {
        return Integer.parseInt(nextToken());
    }
    public long nextString() throws IOException {
        return Long.parseLong(nextToken());
    }
    public String nextToken() throws IOException {
        while (tokenizer == null || !tokenizer.hasMoreTokens()) {
            tokenizer = new StringTokenizer(reader.readLine());
        }
        return tokenizer.nextToken();
    }
}

public class TextSearch {
    static int P = 1_000_000_007;

    HashMap<Long, Long> powersCash = new HashMap<>();
    private long pow(long n, long p) {
        if (powersCash.containsKey(p)) {
            return powersCash.get(p);
        }
        if (p == 0) {
            return 1L;
        }
        if (p == 1) {
            return n % P;
        }
        long result;
        if (p % 2 == 0) {
            result = (pow(n, p / 2) * pow(n, p / 2)) % P;
        } else {
            result = ((n % P) *
                    (pow(n, (p - 1) / 2) *
                            pow(n, (p - 1) / 2) % P)) % P;
        }
        powersCash.put(p, result);
        return result;
    }

    private long getHash(String str, long x, int endI) {
        long resultHash = 0;
        for (int i = 0; i <= endI; i++) {
            resultHash *= x;
            resultHash %= P;
            resultHash += str.charAt(i);
            resultHash %= P;
        }
        return resultHash % P;
    }

    public List<Integer> search(String text, String pattern) {
        if (text.length() < pattern.length()) {
            return Collections.emptyList();
        }

        long x = ThreadLocalRandom.current().nextLong(P);
        if (x < 0) {
            x *= -1;
        }
        long patternHash = getHash(pattern, x, pattern.length() - 1);
        long currHash = getHash(text, x, pattern.length() - 1);

        ArrayList<Integer> answer = new ArrayList<>();
        StringBuilder currWord = new StringBuilder(text.substring(0, pattern.length()));
        if (patternHash == currHash && currWord.toString().equals(pattern)) {
            answer.add(0);
        }

        for (int i = pattern.length(); i < text.length(); i++) {
            currWord.deleteCharAt(0);
            currWord.append(text.charAt(i));
            currHash += P;
            currHash -= (text.charAt(i - pattern.length()) * pow(x, pattern.length() - 1)) % P;
            currHash %= P;
            currHash *= x % P;
            currHash %= P;
            currHash += text.charAt(i);
            currHash %= P;

            if (patternHash == currHash && currWord.toString().equals(pattern)) {
                answer.add(i - pattern.length() + 1);
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        MyReader in = new MyReader(new InputStreamReader(System.in));
        String pattern = in.nextToken();
        String text = in.nextToken();

        List<Integer> answer = new TextSearch().search(text, pattern);
        PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        for (Integer el : answer) {
            sb.append(el).append(" ");
        }

        writer.println(sb.toString().trim());
        writer.close();
    }

}
