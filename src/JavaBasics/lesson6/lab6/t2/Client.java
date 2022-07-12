package JavaBasics.lesson6.lab6.t2;

public class Client extends Human implements Account{
    String bankName;
    Long accNumber;

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public Client (String name, String surname, String bankName, Long accNumber) {
        super(name, surname);
        this.bankName = bankName;
        this.accNumber = accNumber;
    }
    @Override
    public Long displayAccDetails() {
        return accNumber;
    }

    @Override
    public void setAcc(Long accNumber) {
        this.accNumber = accNumber;
    }

    @Override
    public String getInfo() {
        return getName() + " клиент банка " + getBankName() + ", номер счета: " + displayAccDetails();
    }



}
