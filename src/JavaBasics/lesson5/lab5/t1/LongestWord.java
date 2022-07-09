package JavaBasics.lesson5.lab5.t1;

import java.util.Arrays;

public class LongestWord {
    public static void main(String[] args) {
        String text = "Даже всемогущая пунктуация не имеет власти над текстами, ведущими безорфографичный образ жизни.";
        longestWord(text);
    }

    public static void longestWord(String text) {

        text = text.replaceAll("\\p{Punct}", ""); // убираем знаки препинания

        String[] words = text.split(" "); // делим по словам

        Integer[] wordsLength = new Integer[words.length];
        int index = 0;

        for (String w : words) {
            int numOfLetters = w.length();
            wordsLength[index] = numOfLetters;
            index++;
        }

        Arrays.sort(wordsLength);

        for (String word : words) {
            if (word.length() == wordsLength[wordsLength.length-1]) {
                System.out.println("Самое длинное слово: " + word);
            }
        }
    }
}


