package us.kpatrick;

/**
 * Class to hold person information
 * @author kpatr
 * @version 1.0.0
 */
public class Person implements Weighable {
    public String firstName;
    public String lastName;
    public int age;
    public static boolean awake = true;

    /**
     * blank constructor Does nothing
     */
    public Person () {

    }

    /**
     * Instantiate with just the first name
     * @param firstName first name of person
     */
    public Person(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Instantiate with jus the age
     * @param age age of person
     */
    public Person(int age) {
        this.age = age;
    }

    /**
     * Instantiate with first name last name and age
     * @param firstName first name
     * @param lastName last name
     * @param age age of person
     */
    public Person (String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;

    }

    /**
     * Check if person is awake
     * @return boolean if person is awake
     */
    public static boolean isAwake() {
        return awake;
    }

    /**
     * Add weight to the person
     * @param pounds weight added
     */
    @Override
    public void addWeight(double pounds) {

    }

    /**
     * Reduce weight of person
     * @param pounds removes weight
     */
    @Override
    public void loseWeight(double pounds) {

    }

    /**
     * output the details of the person
     * @return string about the person
     */
    @Override
    public String toString() {
        return this.firstName + " " + this.lastName + " is " + this.age + " year(s) old!";
    }
}
