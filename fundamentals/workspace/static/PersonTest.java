public class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Person(10, "Person1");
        Person person2 = new Person(23, "Person2");
        Person person3 = new Person(33, "Person3");
        //this number of people variable is being shared amount all of our instances
        System.out.println(Person.peopleCount());
    }
}
