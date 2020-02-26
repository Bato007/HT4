import org.junit.Test;

import static org.junit.Assert.*;

public class ListaDobleTest {

    ListaDoble<Integer> cuate = new ListaDoble<Integer>();
    @Test
    public void add() {
        cuate.add(23);
        cuate.add(31);
        cuate.add(41);

        int hola = cuate.remove();
        System.out.println(hola);
        assertEquals(hola, 41);
    }

}