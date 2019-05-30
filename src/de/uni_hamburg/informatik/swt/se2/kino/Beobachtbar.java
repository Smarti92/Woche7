package de.uni_hamburg.informatik.swt.se2.kino;

import java.util.ArrayList;
import java.util.List;

/**
 * Das interface für beobachtbare Services. Definiert Operationen zum An- und
 * Abmelden von Beobachtern.
 */
public abstract class Beobachtbar {
    // Liste mit allen Beobachtern
    private final List<Beobachter> _beobachter;

    /**
     * Erzeugt ein neues beobachtbares Objekt.
     */
    public Beobachtbar()
    {
        _beobachter = new ArrayList<>();
    }

    /**
     * Meldet Änderungen an alle Beobachter.
     */
    protected void meldeAenderungen()
    {
        for (Beobachter beobachter : _beobachter) {
            beobachter.reagiereAufAenderungen(this);
        }
    }

    /**
     * Meldet den gegebenen Beoabachter an.
     *
     * @param beobachter Ein Beobachter, der angemeldet werden soll.
     */
    public void registriereBeobachter(Beobachter beobachter)
    {
        _beobachter.add(beobachter);
    }

    /**
     * Meldet den gegebenen Beoabachter ab.
     *
     * @param beobachter Ein Beobachter, der abgemeldet werden soll.
     */
    public void entferneBeobachter(Beobachter beobachter)
    {
        _beobachter.remove(beobachter);
    }
}
