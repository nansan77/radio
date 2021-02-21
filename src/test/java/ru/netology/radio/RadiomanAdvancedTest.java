package ru.netology.radio;

        import org.junit.jupiter.api.Test;

        import static org.junit.jupiter.api.Assertions.assertEquals;


public class RadiomanAdvancedTest {
    @Test
    public void getMaxStation(){
        RadiomanAdvanced radio = new RadiomanAdvanced(
                9,
                4,
                100,
                50,
                true);

        assertEquals(9, radio.getMaxStation());

    }
    @Test
    public void getCurrentStation(){
        RadiomanAdvanced radio = new RadiomanAdvanced(
                9,
                4,
                100,
                50,
                true);

        assertEquals(4, radio.getCurrentStation());
    }
    @Test
    public void getMaxVolume(){
        RadiomanAdvanced radio = new RadiomanAdvanced(
                9,
                4,
                100,
                50,
                true);

        assertEquals(100, radio.getMaxVolume());
    }
    @Test
    public void getCurrentVolume(){
        RadiomanAdvanced radio = new RadiomanAdvanced(
                9,
                4,
                100,
                50,
                true);

        assertEquals(50, radio.getCurrentVolume());
    }
    @Test
    public void getNextStation(){
        RadiomanAdvanced radio = new RadiomanAdvanced(
                9,
                4,
                100,
                50,
                true);
        radio. nextStation();

        assertEquals(5, radio.getCurrentStation());
    }
    @Test
    public void getNextStation1(){
        RadiomanAdvanced radio = new RadiomanAdvanced(
                9,
                0,
                100,
                50,
                true);
        radio. nextStation();

        assertEquals(1, radio.getCurrentStation());
    }
    @Test
    public void getPrevStation(){
        RadiomanAdvanced radio = new RadiomanAdvanced(
                9,
                4,
                100,
                50,
                true);
        radio.setCurrentStation(4);
        radio.prevStation();

        assertEquals(3, radio.getCurrentStation());
    }
    @Test
    public void getPrevStation1(){
        RadiomanAdvanced radio = new RadiomanAdvanced(
                9,
                4,
                100,
                50,
                true);
        radio.setCurrentStation(0);
        radio.prevStation();

        assertEquals(9, radio.getCurrentStation());
    }
    @Test
    public void getPrevStation2(){
        RadiomanAdvanced radio = new RadiomanAdvanced(
                9,
                4,
                100,
                50,
                true);
        radio.setCurrentStation(-3);
        radio.prevStation();

        assertEquals(0, radio.getCurrentStation());
    }
    @Test
    public void getPrevStation3(){
        RadiomanAdvanced radio = new RadiomanAdvanced(
                9,
                4,
                100,
                50,
                true);
        radio.setCurrentStation(15);
        radio.prevStation();

        assertEquals(9, radio.getCurrentStation());
    }
    @Test
    public void getAdditionCurrentVolume(){
        RadiomanAdvanced radio = new RadiomanAdvanced(
                9,
                4,
                100,
                50,
                true);
        radio.additionCurrentVolume();

        assertEquals(51, radio.getCurrentVolume());
    }
    @Test
    public void getAdditionCurrentVolume1(){
        RadiomanAdvanced radio = new RadiomanAdvanced(
                9,
                4,
                100,
                100,
                true);
        radio.additionCurrentVolume();

        assertEquals(100, radio.getCurrentVolume());
    }
    @Test
    public void getDincreaseCurrentVolume1(){
        RadiomanAdvanced radio = new RadiomanAdvanced(
                9,
                4,
                100,
                100,
                true);
        radio.setCurrentVolume(4);
        radio.decreaseCurrentVolume();

        assertEquals(3, radio.getCurrentVolume());
    }
    @Test
    public void getDincreaseCurrentVolume2(){
        RadiomanAdvanced radio = new RadiomanAdvanced(
                9,
                4,
                100,
                0,
                true);

        radio.decreaseCurrentVolume();

        assertEquals(0, radio.getCurrentVolume());
    }
    @Test
    public void getDincreaseCurrentVolume3(){
        RadiomanAdvanced radio = new RadiomanAdvanced(
                9,
                4,
                100,
                38,
                true);

        radio.decreaseCurrentVolume();

        assertEquals(37, radio.getCurrentVolume());
    }
    }














