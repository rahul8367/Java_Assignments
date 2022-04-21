package Assignment5.Main;
import Assignment5.Data.*;
import Assignment5.Singleton.*;
public class MainClass {
    public static void main(String[] args) {
        Data data = new Data();
        data.printGlobalUnInitialized();
        data.printLocalUnInitialized();

        Singleton singleton = Singleton.initialize("Initial String");
        singleton.printString();
    }
}
