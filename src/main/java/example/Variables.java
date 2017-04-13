package example;

public class Variables {
    private static final String UNUSED = "123";
    private static final String USED = "456";
    private String unused;
    private String used;

    public void setUnused(final String unused) {
        if ("457".equals(USED)) {
            this.unused = unused;
        }
    }

    public String getUsed() {
        return used;
    }
}
