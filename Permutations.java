public class Permutations {
    public static void main(String[] args) {
        String input = "abc";
        generatePermutations(input, "");
    }

    public static void generatePermutations(String remaining, String current) {
        if (remaining.isEmpty()) {
            System.out.println(current);  // Print the current permutation
            return;
        }

        for (int i = 0; i < remaining.length(); i++) {
            char currentChar = remaining.charAt(i);
            String newRemaining = remaining.substring(0, i) + remaining.substring(i + 1);
            generatePermutations(newRemaining, current + currentChar);
        }
    }
}
