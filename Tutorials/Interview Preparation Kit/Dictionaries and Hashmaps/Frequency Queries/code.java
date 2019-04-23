import java.io.*;
import java.text.*;
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
public class Solution {

    // Complete the freqQuery function below.
    static List<Integer> freqQuery(List<int[]> queries) {
        HashMap<Integer, Integer> c = new HashMap<Integer, Integer>();
        HashMap<Integer, Integer> f = new HashMap<Integer, Integer>();
        List<Integer> r = new ArrayList<Integer>();
        for(int i = 0; i < queries.size(); i++){
            int type = queries.get(i)[0];
            int n = queries.get(i)[1];
            if(type == 1){
                if(c.containsKey(n)){//2-nth insertion
                    int m = c.get(n);
                    int m1 = m + 1;
                    c.put(n, m1);

                    if(f.containsKey(m1)) f.put(m1, f.get(m1) + 1);
                    else f.put(m1, 1);

                    if(f.containsKey(m)){
                        f.put(m, f.get(m) - 1);
                        if(f.get(m) < 1) f.remove(m);
                    }

                }
                else{//first insertion
                    c.put(n, 1);
                    if(f.containsKey(1))
                        f.put(1, f.get(1) + 1);
                    else
                        f.put(1, 1);
                }
            }
            else if(type == 2){
                if(c.containsKey(n)){
                    int m = c.get(n);
                    int m1 = m - 1;
                    c.put(n, m1);

                    if(m1 <= 0)
                        c.remove(n);

                    if(f.containsKey(m)){
                        f.put(m, f.get(m) - 1);
                        if(f.get(m) <= 0) f.remove(m);
                    }

                    if(f.containsKey(m1))
                        f.put(m1, f.get(m1) + 1);
                    else
                        f.put(m1, 1);

                }
                else{//no occurence detected
                    continue;
                }
            }
            else{
                if(f.containsKey(n)  && f.getOrDefault(n, 0) > 0)
                    r.add(1);
                else
                    r.add(0);
            }

        }
        return r;


    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            int q = Integer.parseInt(bufferedReader.readLine().trim());
            List<int[]> queries = new ArrayList<>(q);
            Pattern p  = Pattern.compile("^(\\d+)\\s+(\\d+)\\s*$");
            for (int i = 0; i < q; i++) {
                int[] query = new int[2];
                Matcher m = p.matcher(bufferedReader.readLine());
                if (m.matches()) {
                    query[0] = Integer.parseInt(m.group(1));
                    query[1] = Integer.parseInt(m.group(2));
                    queries.add(query);
                }
            }
            List<Integer> ans = freqQuery(queries);
            try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")))) {
                bufferedWriter.write(
                    ans.stream()
                        .map(Object::toString)
                        .collect(joining("\n"))
                        + "\n");
            }
        }
    }
}
