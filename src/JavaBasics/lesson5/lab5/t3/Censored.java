package JavaBasics.lesson5.lab5.t3;

public class Censored {
    public static void main(String[] args) {
        String text = "Однажды одна маленькая бяка текста по имени Бяка решила выйти в большой мир БяКа";
        System.out.println(text);
        censored(text, "бяка");
    }

    public static void censored(String text, String censWord) {
        if (text == null) {
            throw new IllegalArgumentException("Пустой текст");
        }

        text = text.toLowerCase();

        text = text.replaceAll(censWord, "[вырезано цензурой]");
        System.out.println(text);

    }
}

