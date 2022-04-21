package Assignment6;

public class OverLoaded {
    OverLoaded(){
        this("First Constructor");

    }
    OverLoaded(String input){
        System.out.println("Second Constructor called from : "+input);
    }
}