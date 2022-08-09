package Creational.Factory.Builder;

import Creational.Factory.Entity.Samsung;
import Creational.Factory.Enum.PhoneBrands;

public class SamsungBuilder {
    private String model;
    private String year;
    private String capacity;
    private PhoneBrands phoneBrands;

    public static SamsungBuilder startBuild() {
        return new SamsungBuilder();
    }

    public Samsung build() {
        Samsung samsung = new Samsung();
        samsung.setModel(model);
        samsung.setYear(year);
        samsung.setCapacity(capacity);
        samsung.setPhoneBrand(phoneBrands);

        return samsung;
    }

    public SamsungBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    public SamsungBuilder setYear(String year) {
        this.year = year;
        return this;
    }

    public SamsungBuilder setCapacity(String capacity) {
        this.capacity = capacity;
        return this;
    }

    public SamsungBuilder setPhoneBrands(PhoneBrands phoneBrands) {
        this.phoneBrands = phoneBrands;
        return this;
    }
}
