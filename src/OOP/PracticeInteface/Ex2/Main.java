package OOP.PracticeInteface.Ex2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();

        persons.add(new Russian("Иван"));
        persons.add(new European("Adam"));
        persons.add(new Chinese("Lee"));

        for(Person person: persons){
            System.out.println(person.sayHello());
        }
    }
}
