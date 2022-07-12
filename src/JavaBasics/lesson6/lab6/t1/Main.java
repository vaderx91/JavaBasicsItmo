package JavaBasics.lesson6.lab6.t1;

public class Main {
    public static void main(String[] args) {
        Client client1 = new Client("Сергей", "Иванов", "ВТБ (ПАО)");
        BankEmployee bankEmployee1 = new BankEmployee("Иван", "Сергеев", "Альфабанк");

        System.out.println(client1.getInfo());
        System.out.println(bankEmployee1.getInfo());

        client1.setBankName("Тинькофф");
        bankEmployee1.setBankName("ПАО Сбербанк");

        System.out.println(client1.getInfo());
        System.out.println(bankEmployee1.getInfo());
    }
}
