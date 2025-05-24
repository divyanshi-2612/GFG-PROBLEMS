class Solution {
    // Function to locate the occurrence of the string x in the string s.
    int firstOccurence(String txt, String pat) 
    {
        int n = txt.length();
        int m = pat.length();
        for (int i=0; i<=n-m; i++)
        {
            boolean found = true;
            for (int j=0; j<m; j++)
            {
                if(txt.charAt(i+j) != pat.charAt(j))
                {
                     found = false;
                break;
                }
                
            }
            if (found) return i;
        
        }
         return -1;
    }
}