import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

//AppTest contains all JUnit Tests
public class AppTest {

    //There are ten tests from 1->10 ensuring the fibonacci sequence is properly returned
    
    @Test
    void termOne() {
        assertEquals(1,Main.fibonacci(1));
    }

    @Test
    void termTwo() {
        assertEquals(1,Main.fibonacci(2));
    }

    @Test
    void termThree() {
        assertEquals(2,Main.fibonacci(3));
    }

    @Test
    void termFour() {
        assertEquals(3,Main.fibonacci(4));
    }

    @Test
    void termFive() {
        assertEquals(5,Main.fibonacci(5));
    }

    @Test
    void termSix() {
        assertEquals(8,Main.fibonacci(6));
    }

    @Test
    void termSeven() {
        assertEquals(13,Main.fibonacci(7));
    }

    @Test
    void termEight() {
        assertEquals(21,Main.fibonacci(8));
    }

    @Test
    void termNine() {
        assertEquals(34,Main.fibonacci(9));
    }

    @Test
    void termTen() {
        assertEquals(55,Main.fibonacci(10));
    }   
}