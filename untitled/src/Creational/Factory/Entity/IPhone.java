package Creational.Factory.Entity;

import Creational.Factory.Enum.PhoneBrands;
import Creational.Factory.Phone;

public class IPhone implements Phone {

    private String model;
    private String year;
    private String capacity;
    private PhoneBrands phoneBrands;

    public IPhone() {

    }

    public IPhone(String model, String year, String capacity, PhoneBrands phoneBrands) {
        this.model = model;
        this.year = year;
        this.capacity = capacity;
        this.phoneBrands = phoneBrands;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String getYear() {
        return year;
    }

    @Override
    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public String getCapacity() {
        return capacity;
    }

    @Override
    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    @Override
    public PhoneBrands getPhoneBrand() {
        return phoneBrands;
    }

    @Override
    public void setPhoneBrand(PhoneBrands phoneBrands) {
        this.phoneBrands = phoneBrands;
    }

}
