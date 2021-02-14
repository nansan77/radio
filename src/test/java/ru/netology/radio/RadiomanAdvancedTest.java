package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class RadiomanAdvancedTest {
    @Test
    public void shouldStation() {
        RadiomanAdvanced radiomenAdvanced = new RadiomanAdvanced();
        String expected = "radioman";
        assertNull(radiomenAdvanced.getStation());
        radiomenAdvanced.setStation(expected);
        assertEquals(expected, radiomenAdvanced.getStation());
    }

    @Test
    public void setCurrentStation() {
        RadiomanAdvanced radiomenAdvanced = new RadiomanAdvanced();
        radiomenAdvanced.setMaxStation(20);
        radiomenAdvanced.setMinStation(0);
        radiomenAdvanced.setCurrentStation(5);
        assertEquals(5, radiomenAdvanced.getCurrentStation());
    }

    @Test
    public void setCurrentStation2() {
        RadiomanAdvanced radiomenAdvanced = new RadiomanAdvanced();
        radiomenAdvanced.setMaxStation(9);
        radiomenAdvanced.setMinStation(7);
        radiomenAdvanced.setCurrentStation(8);
        assertEquals(8, radiomenAdvanced.getCurrentStation());
    }

    @Test
    public void setCurrentStation3() {
        RadiomanAdvanced radiomenAdvanced = new RadiomanAdvanced();
        radiomenAdvanced.setMaxStation(2);
        radiomenAdvanced.setMinStation(9);
        radiomenAdvanced.setCurrentStation(4);
        assertEquals(4, radiomenAdvanced.getCurrentStation());
    }

    @Test
    public void setCurrentStation4() {
        RadiomanAdvanced radiomenAdvanced = new RadiomanAdvanced();
        radiomenAdvanced.setMaxStation(2);
        radiomenAdvanced.setMinStation(0);
        radiomenAdvanced.setCurrentStation(2);
        assertEquals(2, radiomenAdvanced.getCurrentStation());
    }

    @Test
    public void setNextStation() {
        RadiomanAdvanced radiomenAdvanced = new RadiomanAdvanced();
        radiomenAdvanced.setMaxStation(9);
        radiomenAdvanced.setMinStation(0);
        radiomenAdvanced.setCurrentStation(2);
        radiomenAdvanced.setNextStation();
        assertEquals(3, radiomenAdvanced.getCurrentStation());
    }

    @Test
    public void setNextStation1() {
        RadiomanAdvanced radiomenAdvanced = new RadiomanAdvanced();
        radiomenAdvanced.setMaxStation(9);
        radiomenAdvanced.setMinStation(5);
        radiomenAdvanced.setCurrentStation(3);
        radiomenAdvanced.setNextStation();
        assertEquals(4, radiomenAdvanced.getCurrentStation());
    }

    @Test
    public void setNextStation2() {
        RadiomanAdvanced radiomenAdvanced = new RadiomanAdvanced();
        radiomenAdvanced.setMaxStation(2);
        radiomenAdvanced.setMinStation(-1);
        radiomenAdvanced.setCurrentStation(0);
        radiomenAdvanced.setNextStation();
        assertEquals(1, radiomenAdvanced.getCurrentStation());
    }

    @Test
    public void setPreviousStation() {
        RadiomanAdvanced radiomenAdvanced = new RadiomanAdvanced();
        radiomenAdvanced.setMaxStation(2);
        radiomenAdvanced.setMinStation(-1);
        radiomenAdvanced.setCurrentStation(0);
        radiomenAdvanced.setPreviousStation();
        assertEquals(-1, radiomenAdvanced.getCurrentStation());
    }

    @Test
    public void setPreviousStation1() {
        RadiomanAdvanced radiomenAdvanced = new RadiomanAdvanced();
        radiomenAdvanced.setMaxStation(7);
        radiomenAdvanced.setMinStation(0);
        radiomenAdvanced.setCurrentStation(4);
        radiomenAdvanced.setPreviousStation();
        assertEquals(3, radiomenAdvanced.getCurrentStation());
    }

    @Test
    public void setPreviousStation2() {
        RadiomanAdvanced radiomenAdvanced = new RadiomanAdvanced();
        radiomenAdvanced.setMaxStation(4);
        radiomenAdvanced.setMinStation(0);
        radiomenAdvanced.setCurrentStation(3);
        radiomenAdvanced.setPreviousStation();
        assertEquals(2, radiomenAdvanced.getCurrentStation());
    }


    @Test
    public void shouldVolume() {
        RadiomanAdvanced radiomenAdvanced = new RadiomanAdvanced();
        String expected = "radioman";
        assertNull(radiomenAdvanced.getVolume());
        radiomenAdvanced.setVolume(expected);
        assertEquals(expected, radiomenAdvanced.getVolume());
    }

    @Test
    public void setCurrentVolume() {
        RadiomanAdvanced radiomenAdvanced = new RadiomanAdvanced();
        radiomenAdvanced.setMaxVolume(10);
        radiomenAdvanced.setMinVolume(0);
        radiomenAdvanced.setCurrentStation(3);
        assertEquals(0, radiomenAdvanced.getCurrentVolume());
    }

    @Test
    public void setCurrentVolume2() {
        RadiomanAdvanced radiomenAdvanced = new RadiomanAdvanced();
        radiomenAdvanced.setMaxVolume(2);
        radiomenAdvanced.setMinVolume(0);
        radiomenAdvanced.setCurrentStation(8);
        assertEquals(0, radiomenAdvanced.getCurrentVolume());
    }

    @Test
    public void setCurrentVolume3() {
        RadiomanAdvanced radiomenAdvanced = new RadiomanAdvanced();
        radiomenAdvanced.setMaxVolume(1);
        radiomenAdvanced.setMinVolume(0);
        radiomenAdvanced.setCurrentStation(1);
        assertEquals(0, radiomenAdvanced.getCurrentVolume());
    }

    @Test
    public void setNextVolume() {
        RadiomanAdvanced radiomenAdvanced = new RadiomanAdvanced();
        radiomenAdvanced.setMaxVolume(4);
        radiomenAdvanced.setMinVolume(0);
        radiomenAdvanced.setCurrentVolume(9);
        radiomenAdvanced.setNextVolume();
        assertEquals(0, radiomenAdvanced.getCurrentVolume());
    }

    @Test
    public void setNextVolume1() {
        RadiomanAdvanced radiomenAdvanced = new RadiomanAdvanced();
        radiomenAdvanced.setMaxVolume(5);
        radiomenAdvanced.setMinVolume(0);
        radiomenAdvanced.setCurrentVolume(2);
        radiomenAdvanced.setNextVolume();
        assertEquals(3, radiomenAdvanced.getCurrentVolume());
    }

    @Test
    public void setPreviousVolume() {
        RadiomanAdvanced radiomenAdvanced = new RadiomanAdvanced();
        radiomenAdvanced.setMaxVolume(5);
        radiomenAdvanced.setMinVolume(0);
        radiomenAdvanced.setCurrentVolume(8);
        radiomenAdvanced.setPreviousVolume();
        assertEquals(7, radiomenAdvanced.getCurrentVolume());
    }

    @Test
    public void setPreviousVolume1() {
        RadiomanAdvanced radiomenAdvanced = new RadiomanAdvanced();
        radiomenAdvanced.setMaxVolume(10);
        radiomenAdvanced.setMinVolume(0);
        radiomenAdvanced.setCurrentVolume(7);
        radiomenAdvanced.setPreviousVolume();
        assertEquals(6, radiomenAdvanced.getCurrentVolume());
    }

}

