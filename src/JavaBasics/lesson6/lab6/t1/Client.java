package JavaBasics.lesson6.lab6.t1;

public class Client extends Human {
    String bankName;

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public Client (String name, String surname, String bankName) {
        super(name, surname);
        this.bankName = bankName;
    }


    @Override
    public String getInfo() {
        return getName() + " клиент банка " + getBankName();
    }
}
