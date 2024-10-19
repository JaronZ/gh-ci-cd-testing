package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppResourceTest {
    private AppResource sut;

    @BeforeEach
    void setup() {
        sut = new AppResource();
    }

    @Test
    void testHomeReturnsHelloWorldMessage() {
        // Arrange
        String exp = "Hello, World!";

        // Act
        String act = sut.home();

        // Assert
        assertEquals(exp, act);
    }
}
