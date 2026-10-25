class Solution {
    public String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();

        for(int i = 0; i<=s.length()-1;i+=2*k){
            int left = i;
            int right = Math.min(s.length()-1,i+k-1);
            while(left<right){
                char c = arr[left];
                arr[left++] = arr[right];
                arr[right--] = c;
            }
        }
        return new String(arr);
    }
}