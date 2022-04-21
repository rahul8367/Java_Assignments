import java.util.Scanner;
public class AvgTHREE {
    public static void main(String[] args) {
      Scanner Keyboard= new Scanner(System.in);
      System.out.print("enter the size of list ");
      int nuSize=Keyboard.nextInt();
      System.out.print("enter the values of list ");
      float sum=0.0f;
      int temp;
      for(int i=0;i<nuSize;i++){
         temp=Keyboard.nextInt();
         sum+=temp;
      }
      System.out.print("avg of number:"+ sum/nuSize);
    }
}
