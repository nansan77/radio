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
        radiomenAdvanced.setMinStation(0);
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
    public void shoulNextStation2() {
        radiomenAdvanced radiomenAdvanced = new radiomenAdvanced();
        radiomenAdvanced.setMaxStation(2);
        radiomenAdvanced.setMinStation(-1);
        radiomenAdvanced.setCurrentStation(0);
        radiomenAdvanced.setNextStation();
        assertEquals(1, radiomenAdvanced.getCurrentStation());
    }
    @Test
    public void shoulPreviousStation() {
        radiomenAdvanced radiomenAdvanced = new radiomenAdvanced();
        radiomenAdvanced.setMaxStation(2);
        radiomenAdvanced.setMinStation(-1);
        radiomenAdvanced.setCurrentStation(0);
        radiomenAdvanced.setPreviousStation();
        assertEquals(-1, radiomenAdvanced.getCurrentStation());
    }
    @Test
    public void shoulPreviousStation1() {
        radiomenAdvanced radiomenAdvanced = new radiomenAdvanced();
        radiomenAdvanced.setMaxStation(7);
        radiomenAdvanced.setMinStation(0);
        radiomenAdvanced.setCurrentStation(4);
        radiomenAdvanced.setPreviousStation();
        assertEquals(3, radiomenAdvanced.getCurrentStation());
    }
    @Test
    public void shoulPreviousStation2() {
        radiomenAdvanced radiomenAdvanced = new radiomenAdvanced();
        radiomenAdvanced.setMaxStation(4);
        radiomenAdvanced.setMinStation(0);
        radiomenAdvanced.setCurrentStation(3);
        radiomenAdvanced.setPreviousStation();
        assertEquals(2, radiomenAdvanced.getCurrentStation());
    }


    @Test
    public void shoulVolume() {
        radiomenAdvanced radiomenAdvanced = new radiomenAdvanced();
        String expected = "radiomen";
        assertNull(radiomenAdvanced.getVolume());
        radiomenAdvanced.setVolume(expected);
        assertEquals(expected, radiomenAdvanced.getVolume());
    }
    @Test
    public void shoulCurrentVolume() {
        radiomenAdvanced radiomenAdvanced = new radiomenAdvanced();
        radiomenAdvanced.setMaxVolume(10);
        radiomenAdvanced.setMinVolume(0);
        radiomenAdvanced.setCurrentStation(3);
        assertEquals(0, radiomenAdvanced.getCurrentVolume());
    }
    @Test
    public void shoulCurrentVolume2() {
        radiomenAdvanced radiomenAdvanced = new radiomenAdvanced();
        radiomenAdvanced.setMaxVolume(2);
        radiomenAdvanced.setMinVolume(0);
        radiomenAdvanced.setCurrentStation(8);
        assertEquals(0, radiomenAdvanced.getCurrentVolume());
    }
    @Test
    public void shoulCurrentVolume3() {
        radiomenAdvanced radiomenAdvanced = new radiomenAdvanced();
        radiomenAdvanced.setMaxVolume(1);
        radiomenAdvanced.setMinVolume(0);
        radiomenAdvanced.setCurrentStation(1);
        assertEquals(0, radiomenAdvanced.getCurrentVolume());
    }
    @Test
    public void shoulNextVolume() {
        radiomenAdvanced radiomenAdvanced = new radiomenAdvanced();
        radiomenAdvanced.setMaxVolume(4);
        radiomenAdvanced.setMinVolume(0);
        radiomenAdvanced.setCurrentVolume(9);
        radiomenAdvanced.setNextVolume();
        assertEquals(0, radiomenAdvanced.getCurrentVolume());
    }
    @Test
    public void shoulNextVolume1() {
        radiomenAdvanced radiomenAdvanced = new radiomenAdvanced();
        radiomenAdvanced.setMaxVolume(5);
        radiomenAdvanced.setMinVolume(0);
        radiomenAdvanced.setCurrentVolume(2);
        radiomenAdvanced.setNextVolume();
        assertEquals(3, radiomenAdvanced.getCurrentVolume());
    }
    @Test
    public void shoulPreviousVolume() {
        radiomenAdvanced radiomenAdvanced = new radiomenAdvanced();
        radiomenAdvanced.setMaxVolume(5);
        radiomenAdvanced.setMinVolume(0);
        radiomenAdvanced.setCurrentVolume(8);
        radiomenAdvanced.setPreviousVolume();
        assertEquals(7, radiomenAdvanced.getCurrentVolume());
    }
    @Test
    public void shoulPreviousVolume1() {
        radiomenAdvanced radiomenAdvanced = new radiomenAdvanced();
        radiomenAdvanced.setMaxVolume(10);
        radiomenAdvanced.setMinVolume(0);
        radiomenAdvanced.setCurrentVolume(7);
        radiomenAdvanced.setPreviousVolume();
        assertEquals(6, radiomenAdvanced.getCurrentVolume());
    }

}
