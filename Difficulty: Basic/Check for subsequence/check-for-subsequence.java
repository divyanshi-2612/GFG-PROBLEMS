// User function Template for Java

class Solution 
{
    boolean isSubSequence(String A, String B) 
    {
        int i=0 , j=0;
        int n = A.length();
        int m= B.length();
        while(i<n && j<m)
        {
            if(A.charAt(i)==B.charAt(j))
            {
                i++;
            }
            j++;
        }
        return i==n;
    }
}