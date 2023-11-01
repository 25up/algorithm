class Solution {
    public String solution(String s, int n) {
        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            if (Character.isLetter(c)) {
                char base = Character.isLowerCase(c) ? 'a' : 'A';
                charArray[i] = (char) (base + (c - base + n) % 26);
            }
        }
        return new String(charArray);
    }
}