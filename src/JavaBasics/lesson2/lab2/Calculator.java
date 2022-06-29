package JavaBasics.lesson2.lab2;

public class Calculator {

    // Сумма
    public static Double sum(Double a, Double b) { return a + b;}
    public static Integer sum(Integer a, Integer b) {return a + b;}
    public static Long sum(Long a, Long b) {return a + b;}

    //Вычитание
    public static Double sub(Double a, Double b) {return a - b;}
    public static Integer sub(Integer a, Integer b) {return a - b;}
    public static Long sub(Long a, Long b) {return a - b;}

    //Умножение
    public static Double multi(Double a, Double b) {return a * b;}
    public static Integer multi(Integer a, Integer b) {return a * b;}
    public static Long multi(Long a, Long b) {return a * b;}

    //Деление
    public static Double div(Double a, Double b) {return (double) a / b;}
    public static Double div(Integer a, Double b) {return (double) a / b;}
    public static Double div(Long a, Long b) {return (double) (a / b);}
    public static void main(String[] args) {
        System.out.println(Calculator.sum(1.2, 2.4));
        System.out.println(Calculator.sum(1, 2));
        System.out.println(Calculator.sum(12L, 24L));

        System.out.println(Calculator.sub(4.3, 2.5));
        System.out.println(Calculator.sub(3, 1));
        System.out.println(Calculator.sub(10L, 3L));

        System.out.println(Calculator.multi(4.3, 2.5));
        System.out.println(Calculator.multi(3, 1));
        System.out.println(Calculator.multi(10L, 3L));

        System.out.println(Calculator.div(4.3, 2.5));
        System.out.println(Calculator.div(3,1d));
        System.out.println(Calculator.div(10L, 3L));

    }

}
