public class Bats extends Mammal {
    public Bats() {
        super(300);

    }

    public void fly() {
        System.out.println("Bat flies");
        this.energyLevel -= 50;
    }

    public void eatHuman() {
        System.out.println("watch out! the bats are comin");
        this.energyLevel += 25;
        
    }

    public void attacksTown() {
        System.out.println("The town is being attacked");
        this.energyLevel -= 100;
    }

    }

