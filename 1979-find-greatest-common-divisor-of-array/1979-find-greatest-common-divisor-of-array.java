class Solution {
    public int gcd(int a , int b){
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public int findGCD(int[] nums) {
        int smallest = nums[0];
        int largest = nums[0];
        
        for(int val : nums){
            if(val > largest){
                largest = val;
            }else if(val < smallest){
                smallest = val;
            }
        }
        return gcd(smallest, largest);
    }
}