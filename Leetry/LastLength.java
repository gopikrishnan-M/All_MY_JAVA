package Leetry;

class LastLength {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("              hello             ")); // Output: 5
    }

    public static int lengthOfLastWord(String s) {
        int last = s.length() - 1;

        // Skip trailing spaces
        while (last >= 0 && s.charAt(last) == ' ') {
            last--;
        }

        int length = 0;
        // Count characters of the last word
        while (last >= 0 && s.charAt(last) != ' ') {
            length++;
            last--;
        }

        return length;
    }
}
