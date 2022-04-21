package Assignment9;
import java.util.regex.Pattern;
import java.util.Scanner;
public class CheckSentence {
    public static void main(String[] args) {
        Scanner KeyBoard=new Scanner(System.in);
        String sentence=KeyBoard.nextLine();
        if(Pattern.matches("^[A-Z].*[.!?]$",sentence)){
            System.out.println("The give input in correct order");

        }
        else
            System.out.println("The give input is not in correct order");
    }
}
