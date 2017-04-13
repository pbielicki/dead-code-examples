package example;

class PackageClass {
    String unused;

    void unusedPackageMethod() {
        this.unused = "UNUSED";
    }
    
    enum PackageEnum {
        XYZ,
        ONE,
        TWO;
    }
    
    class PackageInnerClass {
        String unused;
        
        void unusedInnerPackageMethod() {
        }
    }
}
