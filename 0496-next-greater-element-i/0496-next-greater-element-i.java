class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result  = new int[nums1.length];
        int index = 0;
        for(int value1 : nums1){
            int count = -1;

            for(int i = 0; i < nums2.length; i++){
                if(value1 == nums2[i]){
                    for(int j = i ; j < nums2.length; j++){
                        if(nums2[j] > nums2[i]){
                            count = nums2[j];
                            break;
                        }
                    }
                }
            }
            result[index++] = count;
        }
        return result;
    }
}