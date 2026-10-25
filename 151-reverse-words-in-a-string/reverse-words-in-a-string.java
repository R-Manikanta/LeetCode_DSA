class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        StringBuilder str = new StringBuilder();

        for (int i=words.length-1;i>=0;i--){
            str.append(words[i]).append(" ");
        }
        str.deleteCharAt(str.length()-1);
        return str.toString();
        
    }
}