
class Solution {
    public String longest(List<String> arr) {
        // code here
        String l="";
        for (String s:arr)
        {
            if (l.length() < s.length())
            l=s;
        }
        return l;
    }
}
