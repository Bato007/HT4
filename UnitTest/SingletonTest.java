import org.junit.Test;
import static org.junit.Assert.*;

public class SingletonTest {

    @Test
    public void getSingle() {

        Calculadora first = Singleton.getSingle();
        Calculadora second = Singleton.getSingle();

        assertEquals(first, second);
    }
}