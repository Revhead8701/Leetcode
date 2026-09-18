class Solution {
    public int arrangeCoins(int n) {
        int count =  0;
        int num = 1;

        while(n > 0 && n >= num){
            n = n - num;
            count++;
            num++;
        }

        return count;
    }
}