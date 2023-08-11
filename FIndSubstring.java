public class FIndSubstring {
    public static void subsequences(String str, int idx, String newsString) {
        if (idx == str.length()) {
            System.out.println(newsString);
            return;
        }
        
        char currChar = str.charAt(idx);

        // Include the current character in the subsequence
        subsequences(str, idx + 1, newsString + currChar);

        // Exclude the current character from the subsequence
        subsequences(str, idx + 1, newsString);
    }

    public static void main(String[] args) {
        String str = "hello bro how are u ";
        subsequences(str, 0, "");
    }
}
