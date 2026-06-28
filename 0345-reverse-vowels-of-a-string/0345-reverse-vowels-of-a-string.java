class Solution {
    public String reverseVowels(String s) {
        int left = 0, right = s.length() - 1;
        String vowel = "aeiouAEIOU";
        
        char[] ch = s.toCharArray();

        while(left < right){
            if(!vowel.contains(String.valueOf(ch[left]))){
                left++;
            }else if(!vowel.contains(String.valueOf(ch[right]))){
                right--;
            }else{
                char temp = ch[left];
                ch[left] = ch[right];
                ch[right] = temp;
                left++;
                right--; 
            }
        }

        String result = "";

        for(char value : ch){
            result = result + value;
        }
        return result;
    }
}