package Learning_Package;

import Learning_Package.LearnPackage;

public class Package1 implements LearnPackage {

    @Override
    public int MonthlyPackage(int courses) {
        System.out.println("you where selected package 1 it offers 2 courses free in monthly charge ");
        int totalCost=0;
        if(courses>2)
            totalCost=10+((courses-2)*6);
        else
            totalCost=10;

        return totalCost;
    }
}
