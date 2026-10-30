class Solution {
    public int minimumCardPickup(int[] cards) {
        HashSet<Integer> hashNum = new HashSet<>();
        int left = 0;
        int count =Integer.MAX_VALUE;
        for(int right=0;right<cards.length;right++){
            if(!hashNum.contains(cards[right])){
                hashNum.add(cards[right]);
            }
            else{
                
                while(cards[left]!=cards[right]){
                    hashNum.remove(cards[left]);
                    left++;
                }
                count = Math.min(count,right-left+1);
                hashNum.remove(cards[left]);
                left++;
                hashNum.add(cards[right]);
            }
        }
        if(count!=Integer.MAX_VALUE){
            return count;
        }
        else{
            return -1;
        }
    }
}