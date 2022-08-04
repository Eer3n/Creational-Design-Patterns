package Creational.Singleton;

public class Singleton {

    private static Singleton singleton = new Singleton();

    private String name;
    private String surname;

    private Singleton(){

    }

    public static Singleton getSingleton(){
        return singleton;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getSurname(){
        return surname;
    }

    public void setSurname(String surname){
        this.surname=surname;
    }
}
