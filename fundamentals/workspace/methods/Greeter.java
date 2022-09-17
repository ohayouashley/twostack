public class Greeter {

    public String greet(String name) {
        return createGreeting(name);
    }

    public String greet() {
        return createGreeting("World");
    }
    public String greet(String firstName, String lastName) {
        System.out.println("We are about to greet" + firstName);
        return createGreeting(firstName + " " + lastName);
    }
    private String createGreeting(String toBeGreeted) {
        return "Greetings " + toBeGreeted + ", welcome to the wild world of coding";
    }

    public static void testGreeting(String name) {
        System.out.println("This is a test of a static method, " + name);
    }
    //when createGreeting was private we were not able to access that method in 
    //our GreeterTest.java file because there was no way to access it. When we changed 
    //it to public and re-compiled it, we were then able to access it on our 
    //GreeterTest.java file. 
}

//why is the greeting variable blocked out but the code still runs?