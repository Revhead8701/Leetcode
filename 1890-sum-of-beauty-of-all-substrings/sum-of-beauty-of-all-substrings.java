class Solution {
    public int beautySum(String s) {
         char[] arr = s.toCharArray();
        int totalFreq = 0;
        for(int i = 0; i < arr.length; i++){

            int[] freq = new int[26];
            for (int j = i; j < arr.length; j++){
                freq[arr[j]-'a']++;

                int min = 501;
                int max = 0;

                for(int k = 0; k < 26; k++){
                    if(freq[k] > 0){
                        max = Math.max(max,freq[k]);
                        min = Math.min(min,freq[k]);
                    }
                }
                totalFreq += max - min;
            }
        }
        return totalFreq;
    }
}