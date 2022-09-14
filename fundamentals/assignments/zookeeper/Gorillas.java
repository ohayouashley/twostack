public class Gorillas extends Mammal {

    public Gorillas(int energyLevel) {
        super(energyLevel);
    }

    public void throwSomething() {
        System.out.println("Gorilla throws something");
        this.energyLevel -= 2;
    }

    public void eatBananas() {
        System.out.println("Gorilla eats banana");
        this.energyLevel += 10;
    }

    public void climb() {
        System.out.println("Gorilla climbs");
        this.energyLevel -= 10;
    }
}
