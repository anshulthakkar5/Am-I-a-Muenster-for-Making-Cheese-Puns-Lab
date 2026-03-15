package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }

    @Test
    void testCheddar() {
        App app = new App();
        assertEquals("Cheddar", app.cheesePun(3));
    }

    @Test
    void testGouda() {
        App app = new App();
        assertEquals("Gouda", app.cheesePun(5));
    }

    @Test
    void testMuenster() {
        App app = new App();
        assertEquals("Muenster", app.cheesePun(15));
    }

    @Test
    void testNumber() {
        App app = new App();
        assertEquals("7", app.cheesePun(7));
    }
}
