package Assignment8;
import java.util.Scanner;
public class MainClass {
    public static void main(String[] args) throws NullPointerException {
      Scanner KeyBoard=new Scanner(System.in);
      int inputKey=KeyBoard.nextInt();
      try{
          if(inputKey<0){
              throw new MyError1("the value must greater then 0");

          }
          else if(inputKey>10){
              throw new MyError2("the value must less then 20");
          }
          else if(inputKey==5)
              throw new MyError3("the value must not equal to 5");
      }
      catch (Exception E){
          System.out.println(E);

      }
      finally{
          System.out.println("the program is completed");
      }
    }
}
