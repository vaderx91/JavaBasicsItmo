package JavaBasics.lesson5.lab5.t5;

public class ReverseText {
    public static void main(String[] args) {
        String text = "Далеко-далеко за словесными горами живут рыбные тексты";
        System.out.println(text);
        reversedText(text);
    }

    public static void reversedText(String text) {
        if (text == null) {
            throw new IllegalArgumentException("Пустой текст");
        }

        String reverse = new StringBuilder(text).reverse().toString();
        System.out.println(reverse);
    }
}
