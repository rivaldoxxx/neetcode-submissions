class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(int i=0;i<strs.length;i++)
        {
            String slowo1=strs[i];
            char[]myArray1=slowo1.toCharArray();
            int []count=new int[26];
            Arrays.sort(myArray1);
            String key = new String(myArray1);
            map.computeIfAbsent(key, 
            k -> new ArrayList<>())
            .add(slowo1);
            

        }
        return new ArrayList<>(map.values());
    }
}
