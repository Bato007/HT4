import org.junit.Test;
import static org.junit.Assert.*;;

public class SingletonTest {

    @Test
    public void getSingle() {
        Singleton singleton = new Singleton();
        Calculadora first = singleton.getSingle();
        Calculadora second = singleton.getSingle();

        assertEquals(first, second);
    }
}