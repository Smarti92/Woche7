package de.uni_hamburg.informatik.swt.se2.kino;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BeobachterTest implements Beobachter {
    public static final int CALLS = 12;
    private BeobachtbarTest _beobachtbar;
    private int _received;

    public BeobachterTest()
    {
        super();

        _beobachtbar = new BeobachtbarTest();
        _received = 0;
    }

    @Override
    public void reagiereAufAenderungen(Object obj)
    {
        if (obj instanceof BeobachtbarTest)
            _received++;
    }

    @Test
    public void testReagiereAufAenderungen()
    {
        _beobachtbar.registriereBeobachter(this);
        _beobachtbar.aendere();

        _beobachtbar.entferneBeobachter(this);
        _beobachtbar.aendere();

        assertEquals(CALLS, _received);
    }
}
