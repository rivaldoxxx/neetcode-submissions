class Solution {
    public boolean isAnagram(String s, String t) {
        char[]arr1=s.toCharArray();
        char[]arr2=t.toCharArray();
        int[] count = new int[26];
        for(char c : arr1)
        {
            count[c-'a']++;
        }
        for(char c2 : arr2)
        {
            count[c2-'a']--;
        }
        for (int x : count)
        {
            if (x != 0) 
            {
            return false;
            }
        }
        return true;
    }
    
}
