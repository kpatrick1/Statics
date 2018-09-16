package us.kpatrick;

/**
 * Project using Statics
 * @version 1.0.0
 * @author kpatr
 */

public class Main {

    /**
     * Main starting point of the program
     * @param args
     */
    public static void main(String[] args) {
	// write your code here

        Startup s = new Startup();

        for (Person p : s.people) {
            System.out.println(p.toString());
        }
    }
}
