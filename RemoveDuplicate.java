public class RemoveDuplicate {
    public static boolean[] map = new boolean[26]; // Changed array size to 26 for the entire alphabet
    
    public static void remove(String str, int idx, String newString) {
        if (idx == str.length()) {
            System.out.println(newString);
            return;
        }
        
        char currChar = str.charAt(idx);
        if (currChar == ' ') {  // Handling spaces
            newString += currChar;
            remove(str, idx + 1, newString);
        } else if (!map[currChar - 'a']) {  // Corrected the condition
            newString += currChar;
            map[currChar - 'a'] = true;
            remove(str, idx + 1, newString);
        } else {
            remove(str, idx + 1, newString);
        }
    }
    
    public static void main(String[] args) {
        String str = "helllooo";
        remove(str, 0, "");
    }
}
