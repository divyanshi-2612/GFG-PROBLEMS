// User function Template for Java
class Solution {
    char firstRep(String S) 
    {
        for (int i=0; i<S.length(); i++)
        {
            char ch = S.charAt(i);
            if (S.indexOf(ch) != S.lastIndexOf(ch))
            {
                
                return ch;
            }
        }
        return '#';
       
        
    }
}