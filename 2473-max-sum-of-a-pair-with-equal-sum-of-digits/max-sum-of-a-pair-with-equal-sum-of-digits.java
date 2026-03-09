class Solution {
    public int maximumSum(int[] nums) { 
        Map<Integer, List<Integer>> map = new HashMap<>();
        int n = nums.length;
        int result = -1;

        for(int i = 0 ; i < n ; i++){
            int curr = nums[i];
            int sum = 0;
            
            while(curr > 0){
                sum += curr % 10;
                curr /= 10;
            }
            
            if(!map.containsKey(sum)){
                map.put(sum, new ArrayList<>());
            }
            map.get(sum).add(nums[i]);
        }

        for(List<Integer> valueList : map.values()){
            if(valueList.size() >= 2){
                int listSum = 0;

                Collections.sort(valueList, Collections.reverseOrder());
                listSum = valueList.get(0) + valueList.get(1);

                if(result < listSum) result = listSum;
            }
        }

        return result;
    }
}