package de.uni_hamburg.informatik.swt.se2.kino;

public class BeobachtbarTest extends Beobachtbar {
    public void aendere()
    {
        for (int i = 0; i < BeobachterTest.CALLS; i++) {
            meldeAenderungen();
        }
    }
}
