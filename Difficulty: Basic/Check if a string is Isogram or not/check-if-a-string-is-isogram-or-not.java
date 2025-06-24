

class Solution {
    // Function to check if a string is Isogram or not.
    static boolean isIsogram(String data) {
        // Your code here
        HashSet<Character> set = new HashSet<>();
        for (char c: data.toCharArray())
        {
            if (set.contains(c)) return false;
            set.add(c);
        }
        return true;
    }
}