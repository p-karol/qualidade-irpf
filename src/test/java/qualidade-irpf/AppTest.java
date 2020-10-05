package qualidade-irpf;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testeRenda3002()
    {
        double actual = App.calculaIrpf(3002.00); 
        double expected = 80.36;
        assertEquals(actual, expected);
    }

    @Test
    public void testeRenda3002()
    {
        double actual = App.calculaIrpf(3002.00); 
        double expected = 80.36;
        assertEquals(actual, expected);
    }

    @Test
    public void testeRenda4520()
    {
        double actual = App.calculaIrpf(4520.00); 
        double expected = 355.60;
        assertEquals(actual, expected);
    }



}