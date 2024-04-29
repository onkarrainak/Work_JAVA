public class WordCounter {

    public static int countWord(String sentence, String word) {
        int count = 0;
        String[] words = sentence.split("\\s+");
        for (String w : words) {
            if (w.equals(word)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String sentence = "Java is programming language.Java supports OOPS, Java suppots secutity";
        String wordToCount = "Java";
        int occurrence = countWord(sentence, wordToCount);
        System.out.println("The word \"" + wordToCount + "\" occurs " + occurrence + " times.");
    }
}
