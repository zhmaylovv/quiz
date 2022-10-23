package ru.sbrf.javaquiz.handlers;


import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StarterHandlerTests {

    private static final String HELO_WORLD = "Hello World";


    @InjectMocks
    private StarterHandler starterHandler;

    @Test
    void shouldRunHelloWorld() {
        String actual = starterHandler.startHear();

        assertEquals(HELO_WORLD, actual);
    }

}
