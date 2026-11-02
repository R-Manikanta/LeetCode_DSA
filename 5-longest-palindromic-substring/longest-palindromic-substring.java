class Solution {
    public String longestPalindrome(String s) {
        if(s.length() <= 1  || s == null){
            return s;
        }
        int maxLength = 0;
        int start=0;

        for(int i=0;i<s.length();i++){
            int left = i;
            int right = i;

            while(left>=0 && right< s.length() && (s.charAt(left) == s.charAt(right))){
                left--;
                right++;
            }
            int currentLength = right-left-1;
            if(currentLength>maxLength){
                maxLength = currentLength;
                start = left+1;
            }

            int left2 = i;
            int right2 = i+1;

            while(left2>=0 && right2<s.length() && (s.charAt(left2) == s.charAt(right2))){
                left2--;
                right2++;
            }
            currentLength = right2-left2-1;
            if(currentLength>maxLength){
                maxLength = currentLength;
                start = left2+1;
            }
        }
        return s.substring(start,start+maxLength);
    }
}