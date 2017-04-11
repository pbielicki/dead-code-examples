package example;
import java.util.Date;

public class LocalVariable {

    public static void main(final String[] args) {
        String unused = "123";

        System.out.println(new Date());

        unused = "12345";
    }
}
