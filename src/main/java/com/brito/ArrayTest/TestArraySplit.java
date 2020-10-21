package main.java.com.brito.ArrayTest;

public class TestArraySplit {

    public static void main(String[] args) {
        String phrase = "Socorram-me, subi no ônibus em Marrocos";

        System.out.println(phrase);

        String[] words = phrase.split(" ");

        String[] wordsReversed = reverse(words);

        String phraseReversed = "";

        for (String word : wordsReversed) {
            phraseReversed += word+" ";
        }

        System.out.println(phraseReversed);

    }

    public static String[] reverse(String array[]) {
        String[] newArray = new String[array.length];
        for (int i=0; i < array.length; i++) {
            newArray[i] = array[(array.length-1)-i];
        }
        return newArray;
    }

}
