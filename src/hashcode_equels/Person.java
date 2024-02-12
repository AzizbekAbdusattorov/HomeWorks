package hashcode_equels;

import java.util.Objects;

public class Person {
    private String name;

    public Person(String name, int age) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
