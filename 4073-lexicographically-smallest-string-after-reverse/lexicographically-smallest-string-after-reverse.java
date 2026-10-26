class Solution {
    public String lexSmallest(String s) {

        ArrayList<StringBuilder> strings = new ArrayList<>();
        StringBuilder sb = new StringBuilder(s);
        StringBuilder temp = new StringBuilder(s);
        if (s == null || s.length() == 0){
            return null;
        }
        if (s.length()==1){
            return s;
        }

        for (int k = 1; k<=s.length()-1;k++){
            temp = new StringBuilder(sb);
            int left = 0;
            int right = k-1;
            while (left < right) {
                char c = temp.charAt(left);
                temp.setCharAt(left++, temp.charAt(right));
                temp.setCharAt(right--, c);
            }
            strings.add(temp);
            temp = new StringBuilder(sb);

            left = sb.length()-1 - k;
            right = sb.length()-1;
            while (left < right) {
                char c = temp.charAt(left);
                temp.setCharAt(left++, temp.charAt(right));
                temp.setCharAt(right--, c);
            }
            strings.add(temp);
        } 
        StringBuilder[] stringArray = strings.toArray(new StringBuilder[0]);
        StringBuilder minstr = stringArray[0];
        for (StringBuilder str : stringArray) {
            // str.compareTo(current) < 0 means str comes BEFORE current alphabetically
            if (str != null && str.compareTo(minstr) < 0) {
                minstr = str;
            }
        }
        return minstr.toString();
    }
}