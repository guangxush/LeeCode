class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        int count1 = jewels.length();
        int count2 = stones.length();
        HashSet<Character> data = new HashSet<Character>();        
        for(int var=0;var<count1;var++)
        {
            char c = jewels.charAt(var);
            data.add(c);
        }
        for(int var=0;var<count2;var++)
        {
            char c = stones.charAt(var);
            if(data.contains(c))
                count++;
        }
        return count;
    }
}
