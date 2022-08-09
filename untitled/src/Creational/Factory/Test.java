package Creational.Factory;

import Creational.Factory.Enum.PhoneBrands;
import Creational.Factory.PhoneFactory.PhoneFactory;

public class Test {
    public static void main(String[] args) {
        Phone IPhone = PhoneFactory.getPhone("iphone 14 pro","2023", "256", PhoneBrands.iphone);
        Phone Samsung = PhoneFactory.getPhone("Samsung Galaxy S23","2023", "256", PhoneBrands.samsung);
        Phone Xiaomi = PhoneFactory.getPhone("Xiaomi X23","2023","256", PhoneBrands.xiaomi);
    }
}
