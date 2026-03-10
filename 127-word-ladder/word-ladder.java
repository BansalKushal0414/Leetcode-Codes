class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if(beginWord.equals(endWord)) return 0;

        Set<String> words = new HashSet<>(wordList);
        int steps = 1;

        Queue<String> queue = new LinkedList<>();
        queue.offer(beginWord);

        while(!queue.isEmpty()){
            int size = queue.size();

            for(int i = 0; i<size;i++){
                String curr = queue.poll();
                if(curr.equals(endWord)) return steps;
                char[] arr = curr.toCharArray();

                for(int j = 0;j<arr.length;j++){
                    char original = arr[j];
                    for(int k = 0;k<26;k++){
                        char newChar = (char)(k+'a');
                        arr[j] = newChar;
                        String updated = new String(arr);

                        if(words.contains(updated)){
                            queue.offer(updated);
                            words.remove(updated);
                        }

                    }
                    arr[j] = original;
                }
            }

            steps++;
        }
        return 0;
    }
}