class Solution {
    public int maxVowels(String s, int k) {
        int n = s.length();
        int maxCount = 0;

        int countVowel = 0;

        String vowels = "aeiou";
        for(int i = 0; i < k; i++){
            
            if(vowels.contains(String.valueOf(s.charAt(i)))){
                countVowel++;
            }
        }
        maxCount = Math.max(countVowel, maxCount);
        
        for(int i = k; i < n; i++){
            
            if(vowels.contains(String.valueOf(s.charAt(i)))){
                countVowel++;
            }
            if(vowels.contains(String.valueOf(s.charAt(i - k)))) {
                countVowel--;
            }
            maxCount = Math.max(countVowel, maxCount);


        }
        return maxCount;
    }
}