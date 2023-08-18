import java.util.*;

public class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> results = new HashMap<>();
        for(int num : nums)
            results.put(num, results.getOrDefault(num, 0) + 1);
        Integer[] freqs = results.values().toArray(new Integer[0]);
        Arrays.sort(freqs);
        List<Integer> tops = new ArrayList<>();
        List<Integer> topsRes = new ArrayList<>();
        for(int i = results.size() - 1; i > results.size() - 1 - k; i--) {
            tops.add(freqs[i]);
        }
        for(Map.Entry entry : results.entrySet()) {
            if(tops.contains(entry.getValue())) {
                topsRes.add((int) entry.getKey());
            }
        }
        int[] answer = new int[k];
        for(int i = 0; i < topsRes.size(); i++)
            answer[i] = topsRes.get(i);
        return answer;
    }
}
