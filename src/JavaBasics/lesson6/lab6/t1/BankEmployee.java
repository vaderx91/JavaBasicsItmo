package JavaBasics.lesson6.lab6.t1;

public class BankEmployee extends Human {
    String bankName;

    public BankEmployee(String name, String surname, String bankName) {
        super(name, surname);
        this.bankName = bankName;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    @Override
    public String getInfo() {
        return getName() + " сотрудник банка " + getBankName();
    }

}
