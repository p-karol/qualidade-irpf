package qualidade;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void testeRenda3002()
    {
        double actual = App.calculaIrpf(3002.00); 
        double expected = 80.36;
        assertEquals(actual, expected);
    }

    @Test
    public void testeRenda1701()
    {
        double actual = App.calculaIrpf(1701.12); 
        double expected = 0;
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