package Assignment7;
public class Cycle {
    public void printType() {
        System.out.println("Just Cycle");
    }

    public void balance() {
        System.out.println("Balance Simple  cycle");
    }
}
class UniCycle extends Cycle {
    public void printType() {
        System.out.println("Uni Cycle");
    }

    public void balance() {
        System.out.println("Unicycle Balance");
    }
}

class Bicycle extends Cycle {
    public void printType() {
        System.out.println("Bi Cycle");
    }

    public void balance() {
        System.out.println("Bicycle Balance");
    }

}

class Tricycle extends Cycle {
    public void printType() {
        System.out.println("Tri Cycle");
    }
}