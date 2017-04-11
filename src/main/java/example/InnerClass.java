package example;

public class InnerClass {

    private static class InnerInnerClass {
        private static final String UNUSED = "123";
        private String unused;

        public void setUnused(final String unused) {
            this.unused = unused;
        }
    }
}
