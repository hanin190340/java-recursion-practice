//task7
public class CharacterCounter {
    public static void main(String[] args) {
        String sentence = "recursion is replacing the repetition of loops";
        char target = 'r';
        int count = countCharRecursive(sentence, target, 0);

        System.out.println("Counting occurrences of '" + target + "' with a Recursive...");

        System.out.println("The character '" + target + "' appears " + count + " times.");
    }

    public static int countCharRecursive(String text, char target, int index) {
        if (index == text.length()) {
            return 0; //base case
        } else {
            //If it matches, return 1 + the result of the recursive call on the next index.
            if (text.charAt(index) == target) {
                return 1 + countCharRecursive(text, target, index + 1);
            }
            //If it doesn't match, return 0 + the result of the recursive call on the next index.
            if (text.charAt(index) != target) {
                return 0 + countCharRecursive(text, target, index + 1);
            }
        }
        return index;
    }

}

