

class Solution 
{
    // Function to remove common characters and concatenate two strings.
    public static String concatenatedString(String s1, String s2) 
    {
        // Your code here
        StringBuilder sb = new StringBuilder();
        
        for(char x: s1.toCharArray())
        {
            if(s2.indexOf(x)==-1) sb.append(x);        
            
        }
        for(char x: s2.toCharArray())
        {
            if(s1.indexOf(x)==-1) sb.append(x);        
            
        }
        return sb.length()==0?"-1":sb.toString();
    }
}
