class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];

        for(char ch : s1.toCharArray()){
            arr1[ch - 'a']++;
        }
        int n1 = s1.length();
        int n2 = s2.length();
        for(int i = 0; i < n2; i++){
            if(i >= n1){
                arr2[s2.charAt(i) - 'a']++;
                arr2[s2.charAt(i - n1) - 'a']--;
            }else{
                arr2[s2.charAt(i) - 'a']++;
            }
            if(Arrays.compare(arr1, arr2) == 0) return true;
        }
        return false;
    }
}