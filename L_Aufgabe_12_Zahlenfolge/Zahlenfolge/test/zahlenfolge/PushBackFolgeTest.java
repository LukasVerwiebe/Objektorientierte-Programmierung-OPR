package zahlenfolge;

import org.junit.Assert;
import org.junit.Test;

/**
 * Testklasse für Methoden der Klasse PushBackFolge.
 */
public class PushBackFolgeTest {

    /**
     * Testet Methoden hatNaechstes und gibNaechstes.
     */
    @Test
    public void testZugriffAufFolge1() {

        PushBackFolge folge = new PushBackFolge(new EndlicheFolge(new int[0]));
        ZahlenfolgeTestUtil.testZugriffAufFolge(folge, new Integer[0], false);
    }

    /**
     * Testet Methoden hatNaechstes und gibNaechstes.
     */
    @Test
    public void testZugriffAufFolge2() {

        PushBackFolge folge = new PushBackFolge(new EndlicheFolge(new int[0]));
        folge.schreibeZurueck(8);
        folge.schreibeZurueck(5);
        folge.schreibeZurueck(2);
        folge.schreibeZurueck(5);
        ZahlenfolgeTestUtil.testZugriffAufFolge(
                folge,
                new Integer[]{8, 5, 2, 5}, false);
    }

    /**
     * Testet Methoden hatNaechstes und gibNaechstes.
     */
    @Test
    public void testZugriffAufFolge3() {

        PushBackFolge folge = new PushBackFolge(new FibonacciFolge());
        Assert.assertEquals(0, folge.gibNaechstes());
        Assert.assertEquals(1, folge.gibNaechstes());
        folge.schreibeZurueck(-100);
        folge.schreibeZurueck(-200);
        Assert.assertEquals(-100, folge.gibNaechstes());
        folge.schreibeZurueck(-300);
        ZahlenfolgeTestUtil.testZugriffAufFolge(
                folge,
                new Integer[]{-200, -300, 1, 2, 3, 5, 8},
                true);
    }
}
