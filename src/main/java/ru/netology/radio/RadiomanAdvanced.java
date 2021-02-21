package ru.netology.radio;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class RadiomanAdvanced {
        private int minStation = 0;
        private int maxStation = 9;
        private int currentStation;
        private int maxVolume = 100;
        private int minVolume = 0;
        private int currentVolume;
        private boolean on;

    public RadiomanAdvanced(int maxStation, int currentStation, int maxVolume, int currentVolume, boolean on) {
        this.maxStation = maxStation;
        this.currentStation = currentStation;
        this.maxVolume = maxVolume;
        this.currentVolume = currentVolume;
        this.on = on;
    }

    public RadiomanAdvanced(int minStation) {
        this.minStation = minStation;
    }

    public void nextStation() {
        if (currentStation >= minStation & currentStation < maxStation) {
            this.currentStation = currentStation + 1;
        }

        if (currentStation == maxStation | currentStation < minStation) {
            this.currentStation = minStation;
        }

        if (currentStation > maxStation) {
            this.currentStation = maxStation;
        }

    }
    public void prevStation() {
        if (currentStation > minStation & currentStation <= maxStation) {
            this.currentStation = currentStation - 1;
        }

        if (currentStation == minStation | currentStation > maxStation) {
            this.currentStation = maxStation;
        }

        if (currentStation < minStation) {
            this.currentStation = minStation;
        }

    }
    public void additionCurrentVolume () {
        if (currentVolume >= minVolume & currentVolume < maxVolume) {
            this.currentVolume = currentVolume + 1;
        }

        if (currentVolume >= maxVolume) {
            this.currentVolume = maxVolume;
        }

        if (currentVolume < minVolume) {
            this.currentVolume = minVolume;
        }
    }

    public void decreaseCurrentVolume () {
        if (currentVolume > minVolume & currentVolume <= maxVolume) {
            this.currentVolume = currentVolume - 1;
        }

        if (currentVolume <= minVolume) {
            this.currentVolume = minVolume;
        }

        if (currentVolume > maxVolume) {
            this.currentVolume = maxVolume;
        }
    }
}












