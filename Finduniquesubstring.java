import java.util.HashSet;

public class Finduniquesubstring {
    

    public static void subsequences(String str, int idx, String newsString,HashSet<String> set) {
        if (idx == str.length()) {
             if(set.contains(newsString)){
                return;
             }else{
                System.out.println(newsString);
                set.add(newsString);
                return;
             }
        }
        
        char currChar = str.charAt(idx);

        // Include the current character in the subsequence
        subsequences(str, idx + 1, newsString + currChar,set);

        // Exclude the current character from the subsequence
        subsequences(str, idx + 1, newsString,set);
    }

    public static void main(String[] args) {
        String str = "abc";
        HashSet<String> set =new HashSet<>();
        subsequences(str, 0, "",set);
    }
}
