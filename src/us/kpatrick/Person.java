package us.kpatrick;

public class Person implements Weighable {
    public String firstName;
    public String lastName;
    public int age;
    public static boolean awake = true;

    public Person () {

    }

    public Person(String firstName) {
        this.firstName = firstName;
    }

    public Person(int age) {
        this.age = age;
    }

    public Person (String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;

    }

    public static boolean isAwake() {
        return awake;
    }

    @Override
    public void addWeight(double pounds) {

    }

    @Override
    public void loseWeight(double pounds) {

    }

    @Override
    public String toString() {
        return this.firstName + " " + this.lastName + " is " + this.age + " year(s) old!";
    }
}
