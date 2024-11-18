package ie.atu.week9;

public class Customer extends Person{
    private int custNumber;
    private boolean mailingList;

    public Customer() {
        this.custNumber = 0;
        this.mailingList = false;
    }

    public Customer(String name, String address, String phone, int custNumber, boolean mailingList) {
        super(name, address, phone);
        this.custNumber = custNumber;
        this.mailingList = mailingList;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", custNumber='" + custNumber + '\'' +
                ", mailingList=" + mailingList ;
    }

    public void setCustNumber(int custNumber) {
        this.custNumber = custNumber;
    }

    public void setMailingList(boolean mailingList) {
        this.mailingList = mailingList;
    }
}
