package EX1_AbstractFactory.Address;

public class KoreanAddress implements Address {
    private String address;
    private static final String country = "South Korea";

    public KoreanAddress(String address){
        this.address = address;
    }

    @Override
    public String getAddress() {
        return this.address + ", " + country;
    }
}
