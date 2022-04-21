package Learning_Package;

import Learning_Package.LearnPackage;

public class Package3 implements LearnPackage {

    @Override
    public int MonthlyPackage(int courses) {
        System.out.println("you where selected package 3 it offers 6 courses free in monthly charge ");
        int totalCost=0;
        if(courses>6)
            totalCost=15+((courses-6)*3);
        else
            totalCost=15;

        return totalCost;
    }
}
