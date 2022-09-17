public class CarTest {
    public static void main(String[] args) {
        

        //Creates a new car and assignt it some values
        Car client1Car = new Car();
        client1Car.year = 2001;
        client1Car.make = "Toyota";
        client1Car.model = "Avalon";
        client1Car.color = "White";

        //create another car and assign it some values
        Car client2Car = new Car();
        client2Car.year = 2019;
        client2Car.make = "Kia";
        client2Car.model = "Ultima";
        client2Car.color = "Navy";

        //now they have their own individual data stored together in the Car object
        System.out.println("Car 1 make:" + client1Car.make);
        




    }
}
