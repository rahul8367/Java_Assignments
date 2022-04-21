import java.util.*;
public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner KeyBoard=new Scanner(System.in);
        int number;
        Random x=new Random();
        int noToGuess=x.nextInt(100)+1;
        while(true){
            number=KeyBoard.nextInt();
            KeyBoard.nextLine();
            if(number==noToGuess){
                System.out.println("Yes the guess was correct..........");
                break;
            }
            else if(number>noToGuess){
                System.out.println("The guess value is to high.... continue playing");
            }
            else{
                System.out.println("The guess value is to low.... continue playing");
            }
        }
    }
}
