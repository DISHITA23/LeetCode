class Solution {
    public int firstUniqChar(String s) {
        int index = -1;
        char c;
        Map<Character, Integer> charFreqMap = new HashMap<>();

        // Frequency count
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            int freq = charFreqMap.getOrDefault(c, 0);
            charFreqMap.put(c, freq + 1);
        }

        // Find first unique character
        for (int i = 0; i < s.length(); i++) {
            if (charFreqMap.get(s.charAt(i)) == 1) {
                index = i;
                break;
            }
        }

        return index;
    }
}
