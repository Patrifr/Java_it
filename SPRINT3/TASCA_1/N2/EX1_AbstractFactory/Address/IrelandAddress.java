package EX1_AbstractFactory.Address;

public class IrelandAddress implements Address {
    private String address;
    private static final String country = "Ireland";

    public IrelandAddress(String address){
        this.address = address;
    }

    @Override
    public String getAddress() {
        return this.address + ", " + country;
    }
}
