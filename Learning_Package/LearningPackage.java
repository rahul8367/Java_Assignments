package Learning_Package;

import Learning_Package.LearnPackage;

import java.util.Scanner;
public class LearningPackage {
    public static void main(String[] args) {
     System.out.println("Enter the package you want to select and number of courses they are given below \n"+"package1 for 10rs with 2 courses, For extra courses it charge 6rs\n"+"package2 for 12rs with 4 courses, For extra courses it charge 4rs\n"+"package3 for 15rs with 6 courses, For extra courses it charge 3rs");
     Scanner KeyBoard=new Scanner(System.in);
     String select=KeyBoard.nextLine();
     int noCourses=KeyBoard.nextInt();
        KeyBoard.nextLine();
     LearnPackage res= PakageSelect.getselect(select);
     int result= res.MonthlyPackage(noCourses);
     if(result>0){
     System.out.print("Total monthly chagre for "+noCourses +" courses is : "+result);
    }
    }
}
