package JavaBasics.lesson5.lab5.t4;

public class Includings {
    public static void main(String[] args) {
        String text = "Однажды одна маленькая бяка текста по имени Бяка решила выйти в большой мир бяка";
        inclCounter(text, "бяка");
    }

    public static void inclCounter(String text, String reqWord) {
        if (text == null || reqWord == null) {
            throw new IllegalArgumentException("Пустой текст");
        }

        int match = 0;
        text = text.toLowerCase();

        String[] words = text.split(" ");

        for (String word : words) {
            if (word.equals(reqWord)) {
                match++;
            }
        }

        if (match >= 1) {
            System.out.println("Количество совпадений: " + match);
        } else {
            System.out.println("Совпадений не найдено");
        }
    }
}
