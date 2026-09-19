class Solution {
    public String largestNumber(int[] nums) {
        int n = nums.length;
        String[] strArray = new String[n];

        for(int i = 0; i < n; i++){
            strArray[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(strArray, (a,b) -> (b + a).compareTo(a + b));

        if(strArray[0].equals("0")) return "0";
 
        StringBuilder sb = new StringBuilder();

        for(String str : strArray){
            sb.append(str);
        }
        return sb.toString();
    }
}