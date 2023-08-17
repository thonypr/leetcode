import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> results = new HashMap<>();
        for(String item : strs) {
            char[] wordAsArray = item.toCharArray();
            Arrays.sort(wordAsArray);
            String hash = new String(wordAsArray);
            if(!results.containsKey(hash))
                results.put(hash, new ArrayList<>());
            results.get(hash).add(item);
        }
        return new ArrayList<>(results.values());
    }
}
