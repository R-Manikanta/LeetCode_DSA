class Solution {
    public int climbStairs(int n) {
        if (n<=2){
            return n;
        }
        int previous_one = 2;
        int previous_two = 1;
        int current;
        for(int i=2;i<n;i++){
            current = previous_one+previous_two;
            previous_two = previous_one;
            previous_one = current;
        }
        return previous_one;
    }
}