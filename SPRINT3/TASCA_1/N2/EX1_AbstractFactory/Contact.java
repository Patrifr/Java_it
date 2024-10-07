package EX1_AbstractFactory;

import EX1_AbstractFactory.Address.Address;
import EX1_AbstractFactory.Phone.Phone;

public class Contact {
    private String name;
    private Address address;
    private Phone phone;

    public Contact(String name, Address address, Phone phone){
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }
    public Address getAddress() {
        return address;
    }
    public Phone getPhone() {
        return phone;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + ".\n" +
                "Address: " + this.address.getAddress() + ".\n" +
                "Phone: " + this.phone.getNum() + ".\n";
    }
}
