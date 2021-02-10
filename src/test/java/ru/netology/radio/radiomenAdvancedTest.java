package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class radiomenAdvancedTest {

    @Test
    public void shoulStation() {
        radiomenAdvanced radiomenAdvanced = new radiomenAdvanced();
        String expected = "radiomen";
        assertNull(radiomenAdvanced.getStation());
        radiomenAdvanced.setStation(expected);
        assertEquals(expected, radiomenAdvanced.getStation());
    }
    @Test
    public void shoulCurrentStation() {
        radiomenAdvanced radiomenAdvanced = new radiomenAdvanced();
        radiomenAdvanced.setMaxStation(20);
        radiomenAdvanced.setMinStation(3);
        radiomenAdvanced.setCurrentStation(5);
        assertEquals(5, radiomenAdvanced.getCurrentStation());
    }
    @Test
    public void shoulCurrentStation2() {
        radiomenAdvanced radiomenAdvanced = new radiomenAdvanced();
        radiomenAdvanced.setMaxStation(9);
        radiomenAdvanced.setMinStation(7);
        radiomenAdvanced.setCurrentStation(8);
        assertEquals(8, radiomenAdvanced.getCurrentStation());
    }
    @Test
    public void shoulCurrentStation3() {
        radiomenAdvanced radiomenAdvanced = new radiomenAdvanced();
        radiomenAdvanced.setMaxStation(2);
        radiomenAdvanced.setMinStation(9);
        radiomenAdvanced.setCurrentStation(4);
        assertEquals(0, radiomenAdvanced.getCurrentStation());
    }
    @Test
    public void shoulCurrentStation4() {
        radiomenAdvanced radiomenAdvanced = new radiomenAdvanced();
        radiomenAdvanced.setMaxStation(2);
        radiomenAdvanced.setMinStation(0);
        radiomenAdvanced.setCurrentStation(2);
        assertEquals(2, radiomenAdvanced.getCurrentStation());
    }
    @Test
    public void shoulNextStation() {
        radiomenAdvanced radiomenAdvanced = new radiomenAdvanced();
        radiomenAdvanced.setMaxStation(9);
        radiomenAdvanced.setMinStation(0);
        radiomenAdvanced.setCurrentStation(2);
        radiomenAdvanced.setNextStation();
        assertEquals(3, radiomenAdvanced.getCurrentStation());
    }
    @Test
    public void shoulNextStation1() {
        radiomenAdvanced radiomenAdvanced = new radiomenAdvanced();
        radiomenAdvanced.setMaxStation(9);
        radiomenAdvanced.setMinStation(5);
        radiomenAdvanced.setCurrentStation(3);
        radiomenAdvanced.setNextStation();
        assertEquals(1, radiomenAdvanced.getCurrentStation());
    }


    @Test
    public void shoulVolume() {
        radiomenAdvanced radiomenAdvanced = new radiomenAdvanced();
        String expected = "radiomen";
        assertNull(radiomenAdvanced.getVolume());
        radiomenAdvanced.setVolume(expected);
        assertEquals(expected, radiomenAdvanced.getVolume());}
}
