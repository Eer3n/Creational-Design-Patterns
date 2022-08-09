package Creational.Factory;

import Creational.Factory.Enum.PhoneBrands;

public interface Phone {


    String getModel();
    void setModel(String model);
    String getYear();
    void setYear(String year);
    String getCapacity();
    void setCapacity(String capacity);
    PhoneBrands getPhoneBrand();
    void setPhoneBrand(PhoneBrands phoneBrands);



}
