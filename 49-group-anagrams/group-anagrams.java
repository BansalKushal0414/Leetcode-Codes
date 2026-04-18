class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();

        HashMap<String, ArrayList<String>> map = new HashMap<>();

        for(int i = 0; i < strs.length; i++){
            int[] freq = new int[26];
            for(int j = 0; j<strs[i].length();j++){
                freq[strs[i].charAt(j) - 'a']++;
            }

            String res = Arrays.toString(freq);

            if(map.containsKey(res)){
                map.get(res).add(strs[i]);
            }
            else{
                map.put(res,new ArrayList<>());
                map.get(res).add(strs[i]);
            }
        }

        for(String st : map.keySet()){
            ans.add(map.get(st));
        }
        return ans;
    }
}