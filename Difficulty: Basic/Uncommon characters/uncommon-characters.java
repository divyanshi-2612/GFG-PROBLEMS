// User function Template for Java

class Solution {
    String uncommonChars(String s1, String s2) {
        // code here
        Set<Character> resultSet = new HashSet<>();
        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>(); 
        
        for (char c:s1.toCharArray())
        
        {
            set1.add(c);
        }
        for (char c:s2.toCharArray())
        
        {
            set2.add(c);
        }
        
        for(char c:set1)
        {
            if (!set2.contains(c))
            {
                resultSet.add(c);
            }
        }
        
        for(char c:set2)
        {
            if (!set1.contains(c))
            {
                resultSet.add(c);
            }
        }
        
        List<Character> resultList = new ArrayList<>(resultSet);
        Collections.sort(resultList);
        
        StringBuilder result= new StringBuilder();
        for(char c:resultList)
        {
            result.append(c);
        }
        
        return result.toString();
    }
}