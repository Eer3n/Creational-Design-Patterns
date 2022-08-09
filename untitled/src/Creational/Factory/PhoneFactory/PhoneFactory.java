package Creational.Factory.PhoneFactory;


import Creational.Factory.Builder.IphoneBuilder;
import Creational.Factory.Builder.SamsungBuilder;
import Creational.Factory.Builder.XiaomiBuilder;
import Creational.Factory.Enum.PhoneBrands;
import Creational.Factory.Phone;

public class PhoneFactory {


    public static Phone getPhone(String model, String year, String capacity, PhoneBrands phoneBrands) {
        Phone phone;
        if (PhoneBrands.iphone == phoneBrands){
            phone = IphoneBuilder.startBuild().build();
        }else if (PhoneBrands.samsung == phoneBrands){
            phone = SamsungBuilder.startBuild().build();
        } else if (PhoneBrands.xiaomi==phoneBrands) {
            phone = XiaomiBuilder.startBuild().build();
        } else {
            throw new RuntimeException("Phone type not found!");
        }
        return phone;
    }
}
