class Solution {
    class Pair{
        int number;
        int bits;

        Pair(int number,int bits){
            this.number = number;
            this.bits = bits;
        }
    }

    public int[] sortByBits(int[] arr) {
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> {
            if(a.bits == b.bits) return a.number - b.number;
            return a.bits - b.bits;
        });

        for(int i = 0;i<arr.length;i++){
            int bit = Integer.bitCount(arr[i]);
            pq.add(new Pair(arr[i], bit));
        }

        for(int i =0;i<arr.length;i++){
            Pair curr = pq.poll();
            arr[i] = curr.number;
        }

        return arr;
    }
}