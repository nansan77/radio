package ru.netology.radio;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class radiomenTest {
    @Test
    public void radiomen(){
        radiomen  radiomen = new radiomen();
        assertEquals(0,radiomen.minStation);
        assertEquals(0,radiomen.maxStation);
        assertEquals(0,radiomen.currentStation);

        assertFalse(radiomen.on);
    }

}
