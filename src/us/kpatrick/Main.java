package us.kpatrick;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Startup s = new Startup();

        for (Person p : s.people) {
            System.out.println(p.toString());
        }
    }
}
