package figuras;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class TestFigura {

    @Test
    public void testGetCor() {
        String retornoEsperado = "Verde";
        Figura circulo = new Circulo();
        circulo.setCor("Verde");
        assertTrue(retornoEsperado.equals(circulo.getCor()));
    }
}
