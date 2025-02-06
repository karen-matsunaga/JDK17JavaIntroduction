package net.karen;

public class Main {
    public static void main(String[] args) {
        /* String and String Methods */

        String sentence = "It's a wonderful Java Introduction!";
        System.out.println(sentence);
        System.out.println("Length is: " + sentence.length()); // Length

        // Upper and Lower case
        System.out.println("SHOUTING: " + sentence.toUpperCase()); // Upper
        System.out.println("whispering: " + sentence.toLowerCase()); // Lower
        System.out.println(sentence);

        // indexOf -> first character in number
        System.out.println("The word 'Java' is found at position: " + sentence.indexOf("Java"));

        // Replace -> the word is replaced to other
        System.out.println(sentence.replace("Java", "C#"));

        // Start and End with
        System.out.println(sentence.startsWith("I")); // Start
        System.out.println(sentence.endsWith("A")); // End

        // Empty -> Phrase is empty of string
        String s = "";
        boolean empty = s.isEmpty();
        System.out.println(empty);

        // Contains -> Phrase contains only the word specified
        System.out.println(sentence.contains("Java"));

        // charAt -> index number of CHARACTER
        System.out.println(sentence.charAt(17));

        // substring -> Show only BEGIN index and END index
        System.out.println(sentence.substring(17));
    }
}