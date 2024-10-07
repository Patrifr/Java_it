package EX1_AbstractFactory.Factories;

import EX1_AbstractFactory.Address.Address;
import EX1_AbstractFactory.Address.IrelandAddress;

import EX1_AbstractFactory.Phone.Ireland;
import EX1_AbstractFactory.Phone.Phone;


public class IrelandContactFactory implements AbstractFactory {
    @Override
    public Phone getPhone(String phone) {
        return new Ireland(phone);
    }

    @Override
    public Address getAddress(String address) {
        return new IrelandAddress(address);
    }
}
