package Creational.Singleton;

public class Test {
    public static void main(String[] args) {

            Singleton elif = Singleton.getSingleton();
            elif.setName("Elif");
            Singleton ege = Singleton.getSingleton();
            ege.setName("Ege");
        System.out.println(elif.getName());
    }
}
