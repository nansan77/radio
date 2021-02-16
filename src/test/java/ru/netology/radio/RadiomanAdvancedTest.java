package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class RadiomanAdvancedTest {

    @Test
    public void setCurrentStation() {
        RadiomanAdvanced radiomenAdvanced = new RadiomanAdvanced();
        radiomenAdvanced.setMaxStation(10);
        radiomenAdvanced.setMinStation(0);
        radiomenAdvanced.setCurrentStation(11);
        assertEquals(0, radiomenAdvanced.getCurrentStation());
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
        radiomenAdvanced.setCurrentStation(-2);
        assertEquals(0, radiomenAdvanced.getCurrentStation());
    }

    @Test
    public void setCurrentStation4() {
        RadiomanAdvanced radiomenAdvanced = new RadiomanAdvanced();
        radiomenAdvanced.setMaxStation(10);
        radiomenAdvanced.setMinStation(0);
        radiomenAdvanced.setCurrentStation(1);
        assertEquals(1, radiomenAdvanced.getCurrentStation());
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
        radiomenAdvanced.setMinStation(0);
        radiomenAdvanced.setCurrentStation(3);
        radiomenAdvanced.setNextStation();
        assertEquals(4, radiomenAdvanced.getCurrentStation());
    }

    @Test
    public void setNextStation2() {
        RadiomanAdvanced radiomenAdvanced = new RadiomanAdvanced();
        radiomenAdvanced.setMaxStation(9);
        radiomenAdvanced.setMinStation(0);
        radiomenAdvanced.setCurrentStation(9);
        radiomenAdvanced.setNextStation();
        assertEquals(9, radiomenAdvanced.getCurrentStation());
    }

    @Test
    public void setPreviousStation() {
        RadiomanAdvanced radiomenAdvanced = new RadiomanAdvanced();
        radiomenAdvanced.setMaxStation(9);
        radiomenAdvanced.setMinStation(0);
        radiomenAdvanced.setCurrentStation(0);
        radiomenAdvanced.setPreviousStation();
        assertEquals(0, radiomenAdvanced.getCurrentStation());
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
    public void setCurrentVolume() {
        RadiomanAdvanced radiomenAdvanced = new RadiomanAdvanced();
        radiomenAdvanced.setMaxVolume(10);
        radiomenAdvanced.setMinVolume(0);
        radiomenAdvanced.setCurrentVolume(17);
        assertEquals(0, radiomenAdvanced.getCurrentVolume());
    }

    @Test
    public void setCurrentVolume2() {
        RadiomanAdvanced radiomenAdvanced = new RadiomanAdvanced();
        radiomenAdvanced.setMaxVolume(10);
        radiomenAdvanced.setMinVolume(0);
        radiomenAdvanced.setCurrentVolume(8);
        assertEquals(8, radiomenAdvanced.getCurrentVolume());
    }

    @Test
    public void setCurrentVolume3() {
        RadiomanAdvanced radiomenAdvanced = new RadiomanAdvanced();
        radiomenAdvanced.setMaxVolume(10);
        radiomenAdvanced.setMinVolume(0);
        radiomenAdvanced.setCurrentVolume(20);
        assertEquals(0, radiomenAdvanced.getCurrentVolume());
    }

    @Test
    public void setNextVolume() {
        RadiomanAdvanced radiomenAdvanced = new RadiomanAdvanced();
        radiomenAdvanced.setMaxVolume(10);
        radiomenAdvanced.setMinVolume(0);
        radiomenAdvanced.setCurrentVolume(10);
        radiomenAdvanced.setNextVolume();
        assertEquals(10, radiomenAdvanced.getCurrentVolume());
    }

    @Test
    public void setNextVolume1() {
        RadiomanAdvanced radiomenAdvanced = new RadiomanAdvanced();
        radiomenAdvanced.setMaxVolume(10);
        radiomenAdvanced.setMinVolume(0);
        radiomenAdvanced.setCurrentVolume(2);
        radiomenAdvanced.setNextVolume();
        assertEquals(3, radiomenAdvanced.getCurrentVolume());
    }

    @Test
    public void setPreviousVolume() {
        RadiomanAdvanced radiomenAdvanced = new RadiomanAdvanced();
        radiomenAdvanced.setMaxVolume(10);
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

    @Test
    public void setPreviousVolume2() {
        RadiomanAdvanced radiomenAdvanced = new RadiomanAdvanced();
        radiomenAdvanced.setMaxVolume(10);
        radiomenAdvanced.setMinVolume(0);
        radiomenAdvanced.setCurrentVolume(0);
        radiomenAdvanced.setPreviousVolume();
        assertEquals(0, radiomenAdvanced.getCurrentVolume());

    }
}

