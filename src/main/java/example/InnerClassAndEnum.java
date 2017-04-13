package example;

public class InnerClassAndEnum {
    public UsedInnerClass useInnerClass() {
        final UsedEnum e = UsedEnum.valueOf("VALUE10");
        if (e == UsedEnum.VALUE10) {
            System.out.println(10);
        }

        final UsedInnerClass result = new UsedInnerClass();
        result.setUsed("123");
        if (result.getUsed() == "123") {
            return result;
        } else {
            return null;
        }
    }

    private static class UsedInnerClass {
        private String used;

        public void setUsed(final String used) {
            this.used = used;
        }

        public String getUsed() {
            return used;
        }
    }
    
    static class PackageInnerClass {
        static final String PACKAGE_UNUSED = "XYZ";
    }

    private static class InnerInnerClass {
        private static final String UNUSED = "123";
        private String unused;

        public void setUnused(final String unused) {
            this.unused = unused;
        }
    }

    private enum PrivateEnum {
        VALUE1,
        VALUE2;
    }

    private enum UsedEnum {
        VALUE10;

        private void unusedEnumMethod() {
        }
    }
}
