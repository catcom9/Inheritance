package ie.atu.week9;

public class Person {
    private String name;
    private String address;
    private String phone;

    public Person() {
        this.name = null;
        this.address = null;
        this.phone = null;
    }


    public Person(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' ;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
