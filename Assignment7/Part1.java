package Assignment7;

public class Part1 {
    public static void main(String[] args) {
        Rodent[] rodents = {new Rodent(), new Mouse(), new Gerbil(), new Hamster()};
        for (Rodent rodent : rodents)
            rodent.printMessage();
    }
}
