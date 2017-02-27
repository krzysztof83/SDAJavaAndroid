package pl.sda.mvc.controler;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Professional on 2/26/2017.
 */
public class ControlerTest {

    @Test
    public void fibonnaciTest0() {
        Controler controler = new Controler();
        final int expected = 0;
        final int actual = controler.getFibonnaci(0);
        assertEquals(expected, actual);
    }

    @Test
    public void fibonnaciTest1() {
        Controler controler = new Controler();
        final int expected = 1;
        final int actual = controler.getFibonnaci(1);
        assertEquals(expected, actual);
    }

    @Test
    public void fibonnaciTest2() {
        Controler controler = new Controler();
        final int expected = 1;
        final int actual = controler.getFibonnaci(2);
        assertEquals(expected, actual);
    }

    @Test
    public void fibonnaciTest3() {
        Controler controler = new Controler();
        final int expected = 2;
        final int actual = controler.getFibonnaci(3);
        assertEquals(expected, actual);
    }

    @Test
    public void fibonnaciTest4() {
        Controler controler = new Controler();
        final int expected = 3;
        final int actual = controler.getFibonnaci(4);
        assertEquals(expected, actual);
    }

}
