class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int arr2[]= arr.clone();

        Arrays.sort(arr2);

        HashMap<Integer,Integer>map=new HashMap<>();
        int rank=1;

        for(int i=0;i<arr2.length;i++){
            if(!map.containsKey(arr2[i])){
                map.put(arr2[i],rank);
                rank++;
            }

        }
        for(int i=0;i<arr.length;i++){
            arr[i]=map.get(arr[i]);
        }
        return arr; 
        
    }
}