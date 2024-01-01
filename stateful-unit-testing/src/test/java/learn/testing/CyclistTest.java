package learn.testing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CyclistTest {
    @Test
    void shouldMakeSmallInvalidPowerTheMinimum(){
        // Arrange
        Cyclist cyclist = new Cyclist("Test Cyclist", 0.111);
        // Act
        double actual = cyclist.getPower();
        // Assert
        assertEquals(1.0, actual, 0.01);

        // Arrange
        cyclist = new Cyclist("Test Cyclist", -100000.0);
        // Act
        actual = cyclist.getPower();
        // Assert
        assertEquals(1.0, actual, 0.01);

    }

    @Test
    void shouldMakeLargeInvalidPowerTheMax(){
        Cyclist actual = new Cyclist("Test Cyclist", 55.5);
        assertEquals(10.0, actual.getPower(), 0.01);

        actual = new Cyclist("Test Cyclist", 999999999);
        assertEquals(10.0, actual.getPower(), 0.01);
    }

    @Test
    void shouldAllowValidPower() {
        Cyclist actual = new Cyclist("Test Cyclist", 5.55);
        assertEquals(5.55, actual.getPower(), 0.01);

        actual = new Cyclist("Test Cyclist", 9.87);
        assertEquals(9.87, actual.getPower(), 0.01);

        actual = new Cyclist("Test Cyclist", 2.12);
        assertEquals(2.12, actual.getPower(), 0.01);
    }

    void shouldGetName() {
        Cyclist actual = new Cyclist("Test Cyclist", 5.55);
        assertEquals("Test Cyclist", actual.getName());

        actual = new Cyclist(null, 5.55);
        // nulls are allowed.
        assertNull(actual.getName());

        actual = new Cyclist("", 5.55);
        // No restrictions on empty strings
        assertEquals("", actual.getName());
    }

}