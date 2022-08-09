package Creational.Factory.Builder;

import Creational.Factory.Entity.Xiaomi;
import Creational.Factory.Enum.PhoneBrands;

public class XiaomiBuilder {

    private String model;
    private String year;
    private String capacity;
    private PhoneBrands phoneBrands;

    public static XiaomiBuilder startBuild() {
        return new XiaomiBuilder();
    }

    public Xiaomi build() {
        Xiaomi xiaomi = new Xiaomi();
        xiaomi.setModel(model);
        xiaomi.setYear(year);
        xiaomi.setCapacity(capacity);
        xiaomi.setPhoneBrand(phoneBrands);

        return xiaomi;
    }

    public XiaomiBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    public XiaomiBuilder setYear(String year) {
        this.year = year;
        return this;
    }

    public XiaomiBuilder setCapacity(String capacity) {
        this.capacity = capacity;
        return this;
    }

    public XiaomiBuilder setPhoneBrands(PhoneBrands phoneBrands) {
        this.phoneBrands = phoneBrands;
        return this;
    }
}
