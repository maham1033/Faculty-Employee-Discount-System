package polymorphism;
import java.awt.*;

public class Person {
    protected String name;
    protected String address;
    public Person(){
    }

    public Person(String name, String address){
        this.name = name;
        this.address=address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}




