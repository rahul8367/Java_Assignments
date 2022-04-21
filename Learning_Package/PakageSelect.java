package Learning_Package;

import Learning_Package.LearnPackage;
import Learning_Package.Package1;
import Learning_Package.Package2;
import Learning_Package.Package3;

public class PakageSelect {
    public static LearnPackage getselect(String in_put){
        if("package1".equalsIgnoreCase(in_put)){
            return new Package1();
        }
        else if("package2".equalsIgnoreCase(in_put)){
            return new Package2();
        }
        else if("package3".equalsIgnoreCase(in_put)) {
            return new Package3();
        }

        return new Defult();
    }
}
