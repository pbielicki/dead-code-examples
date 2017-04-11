package example;

public class Method {

    public void use() {
        used();
    }

    private void used() {
        System.out.println("blahblah");
    }

    private static void staticUnused(String unused, final String used) {
        if ("NO".equals(used)) {
            unused = "1234";
        }
    }

    private void unused(String unused, final String used) {
        if ("YES".equals(used)) {
            unused = "1234";
        }
    }
}
