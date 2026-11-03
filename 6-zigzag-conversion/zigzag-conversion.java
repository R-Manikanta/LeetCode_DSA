class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1 || numRows >=s.length()){
            return s;
        }
        
        StringBuilder result = new StringBuilder();
        int cycle = 2 * (numRows - 1);
        int n = s.length();

        for(int i = 0; i < numRows; i++){
            for(int j = 0; j + i < n; j+=cycle){
                result.append(s.charAt(j+i));
                int diagonal = j+cycle-i;
                if (i!=0 && i!= numRows - 1 && diagonal < n){
                    result.append(s.charAt(diagonal));
                }
            }
        }
        return result.toString();
    }
}