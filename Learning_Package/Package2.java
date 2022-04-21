package Learning_Package;

import Learning_Package.LearnPackage;

public class Package2 implements LearnPackage {

    @Override
    public int MonthlyPackage(int courses) {
        System.out.println("you where selected package 2 it offers 4 courses free in monthly charge ");
        int totalCost=0;
        if(courses>4)
            totalCost=12+((courses-4)*4);
        else
            totalCost=12;

        return totalCost;
    }
}
