class Solution {
    public ArrayList<ArrayList<Integer>> countFreq(int[] arr) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                int freq = map.get(arr[i]);
                map.put(arr[i],freq+1);
            }else map.put (arr[i],1);
        }
        
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for(int key: map.keySet()){
            ArrayList<Integer> freq = new ArrayList<>() ;
            freq.add(key);
            freq.add(map.get(key));
            ans.add(freq);
        }
        
        return ans;
    }
}
