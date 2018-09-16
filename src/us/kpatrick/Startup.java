package us.kpatrick;

import java.util.ArrayList;

public class Startup {

    ArrayList<Person> people = new ArrayList();

    public Startup () {
        Person p1 = new Person("Kevin","Patrick",21);
        Person p2 = new Person ("Jason");
        p2.lastName = "Patrick";
        p2.age = 22;

        Person p3 = new Person(22);
        p3.firstName = "Bob";
        p3.lastName = "Smith";

        people.add(p1);
        people.add(p2);
        people.add(p3);

    }



}
