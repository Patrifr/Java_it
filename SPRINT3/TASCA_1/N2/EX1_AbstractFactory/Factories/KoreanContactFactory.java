package EX1_AbstractFactory.Factories;

import EX1_AbstractFactory.Address.Address;
import EX1_AbstractFactory.Address.KoreanAddress;

import EX1_AbstractFactory.Phone.Phone;
import EX1_AbstractFactory.Phone.Korean;


public class KoreanContactFactory implements AbstractFactory {
    @Override
    public Phone getPhone(String phone) {
        return new Korean(phone);
    }

    @Override
    public Address getAddress(String address) {
        return new KoreanAddress(address);
    }
}
