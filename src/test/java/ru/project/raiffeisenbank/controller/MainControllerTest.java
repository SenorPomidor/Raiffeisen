package ru.project.raiffeisenbank.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainControllerTest {

    @Test
    void testController() {
        MainController mainController = new MainController();
        String helloWorld = mainController.getHelloWorld();

        assertEquals("Hello World!", helloWorld);
    }

}