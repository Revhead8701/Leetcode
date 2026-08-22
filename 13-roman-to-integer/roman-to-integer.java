class Solution {
    public int romanToInt(String s) {
         Map<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int num = 0;
        char[] arr = s.toCharArray();
        char pri = 'I';
        for(int i = arr.length-1; i >= 0; i--){
            char ch = arr[i];
            if(map.get(ch) < map.get(pri)){
                num -= map.get(arr[i]);
            }
            else {
                num += map.get(arr[i]);
            }
            pri = arr[i];
        }
        return num;
    }
}