package Assignment4;
import java.text.ParseException;
import java.util.*;
import java.text.SimpleDateFormat;

public class javaAssignment4 {

    public static void main(String[] args) throws ParseException
    {
        Scanner scan = new Scanner(System.in);
        int tests = scan.nextInt();
        while(tests>0)
        {
            tests--;
            String date1 = scan.next();
            String date2 = scan.next();
            Date signUpDate = new SimpleDateFormat("dd-MM-yyyy").parse(date1);
            Date currentDate = new SimpleDateFormat("dd-MM-yyyy").parse(date2);

            if(currentDate.before(signUpDate))
            {
                System.out.println("No Range");
            }
            else {
                Calendar c1 =  Calendar.getInstance();
                Calendar c2 = Calendar.getInstance();
                c1.setTime(signUpDate);
                c2.setTime(currentDate);

                c1.set(Calendar.YEAR, c2.get(Calendar.YEAR));
                c1.add(Calendar.DAY_OF_MONTH, -30);
                String date3 = new SimpleDateFormat("dd-MM-yyyy").format(c1.getTime());

                c1.add(Calendar.DAY_OF_MONTH, +60);
                String date4 = new SimpleDateFormat("dd-MM-yyyy").format(c1.getTime());
                Date date5 = new SimpleDateFormat("dd-MM-yyyy").parse(date4);

                if (currentDate.before(date5))
                    System.out.println(date3 + " " + date2);
                else
                    System.out.println(date3 + " " + date4);
            }
        }
    }
}