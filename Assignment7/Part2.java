package Assignment7;

public class Part2 {
    public static void main(String[] args) {
        Cycle[] cycles = {new Cycle(), new UniCycle(), new Bicycle(), new Tricycle()};
        for (Cycle cycle : cycles) {
            cycle.balance();
            ((UniCycle) cycle).balance();
            cycle.printType();
        }
    }
}