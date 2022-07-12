package JavaBasics.lesson6.lab6.t2;

public class Main {
    public static void main(String[] args) {
        Client client1 = new Client("Сергей", "Иванов", "ВТБ (ПАО)", 78234333333234L);
        BankEmployee bankEmployee1 = new BankEmployee("Иван", "Сергеев", "Альфабанк" +"\n");

        System.out.println(client1.getInfo());
        System.out.println(bankEmployee1.getInfo());

        client1.setBankName("Тинькофф");
        client1.setAcc(74234346879043L);
        bankEmployee1.setBankName("ПАО Сбербанк");

        System.out.println(client1.getInfo());
        System.out.println(bankEmployee1.getInfo());
    }
}
