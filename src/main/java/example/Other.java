package example;

public class Other {
    public static void main(final String[] args) {
        final String blah = "123";
        for (int i = 0; i < 10000; i++) {
            if (blah == new String("123")) {
                break;
            }
        }
    }
}
