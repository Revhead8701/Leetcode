class Solution {
    public int reverseDegree(String s) {
        int ans = 0;
        char[] arr = s.toCharArray();
        int i = 1;
        for(char ch : arr){
            int val = 26 - (ch-'a');
            ans += val*(i); 
            i++;
        }
        return ans;
    }
}