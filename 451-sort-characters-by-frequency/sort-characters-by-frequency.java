class Solution {
    public String frequencySort(String s) {
        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        HashMap<Character,Integer> mp = new HashMap<>();
        
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }

        pq.addAll(mp.entrySet());

        String ans = "";

        while(!pq.isEmpty()){
            Map.Entry<Character, Integer> e = pq.poll();
            for(int i = 0; i<e.getValue();i++){
                ans+=e.getKey();
            }
        }
        return ans;
    }
}