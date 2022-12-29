import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HelloWorld {
    public static void main(String[] args) {

        System.out.println("Hello world ");

    }
    @Test
    void new_test(){
        Assertions.assertTrue (3>2);
    }
}

