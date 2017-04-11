package example;

public class Variables {
    private static final String UNUSED = "123";
    private String unused;
    private String used;

    public void setUnused(final String unused) {
        this.unused = unused;
    }

    public String getUsed() {
        return used;
    }
}
