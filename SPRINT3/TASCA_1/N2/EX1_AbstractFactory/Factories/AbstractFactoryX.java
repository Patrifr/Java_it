package EX1_AbstractFactory.Factories;

import EX1_AbstractFactory.Address.Address;
import EX1_AbstractFactory.Phone.Phone;

public abstract class AbstractFactoryX {
    abstract Phone getPhone(String phone);
    abstract Address getAddress(String address);
}
