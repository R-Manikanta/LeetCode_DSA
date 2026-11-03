class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1){
            return s;
        }
        ArrayList<StringBuilder> rows = new ArrayList<>();
        StringBuilder result = new StringBuilder();
        int currentRow = 0;
        int direction = 1;

        for(int i=0;i<numRows;i++){
            StringBuilder r = new StringBuilder();
            rows.add(r);
        }

        for(int i=0;i<s.length();i++){
            rows.get(currentRow).append(s.charAt(i));
            if(currentRow==0){
                direction=1;
            }
            else if(currentRow == numRows -1){
                direction=-1;
            }
            currentRow+=direction;
        }

        for(int i=0;i<numRows;i++){
            result.append(rows.get(i));
        }
        return result.toString();
    }
}