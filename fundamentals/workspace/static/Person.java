public class Person {
    private int age;
    private String name;
    // public static int numberOfPeople = 0; //making this private for lesson adding line 14
    private static int numberOfPeople = 0;
    //things that are going to be shared amongst all the instance variables

    public Person(int ageParam, String nameParam) {
        age = ageParam;
        name = nameParam; 
        //here going to keep track of how many instances of this person class i've created
        numberOfPeople++; //number of people is not specific to object but to the class
    }
    public static int peopleCount() {
        return numberOfPeople;
    }
    //remember static methods can only call other static methods.
}

