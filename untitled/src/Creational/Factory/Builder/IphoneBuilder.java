package Creational.Factory.Builder;

import Creational.Factory.Entity.IPhone;
import Creational.Factory.Enum.PhoneBrands;

public class IphoneBuilder {
    private String model;
    private String year;
    private String capacity;
    private PhoneBrands phoneBrands;


    public static IphoneBuilder startBuild() {
        return new IphoneBuilder();
    }

    public IPhone build() {
        IPhone iPhone = new IPhone();
        iPhone.setModel(model);
        iPhone.setYear(year);
        iPhone.setCapacity(capacity);
        iPhone.setPhoneBrand(phoneBrands);


        return iPhone;
    }

    public IphoneBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    public IphoneBuilder setYear(String year) {
        this.year = year;
        return this;
    }

    public IphoneBuilder setCapacity(String capacity) {
        this.capacity = capacity;
        return this;
    }

    public IphoneBuilder setPhoneBrand(PhoneBrands phoneBrands) {
        this.phoneBrands = phoneBrands;
        return this;
    }
}
