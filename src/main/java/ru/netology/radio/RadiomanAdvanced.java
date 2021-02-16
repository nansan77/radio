package ru.netology.radio;

public class RadiomanAdvanced {

    private int maxStation;
    private int minStation;
    private int currentStation;

    private int maxVolume;
    private int minVolume;
    private int currentVolume;
    private boolean on;

    public int getMaxStation() {
        return maxStation;
    }

    public void setMaxStation(int maxStation) {
        this.maxStation = maxStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public void setMinStation(int minStation) {
        this.minStation = minStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            return;
        }

        if (currentStation < minStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void setNextStation() {
        int nextStation = currentStation + 1;
        if (nextStation > maxStation) {
            return;
        } else
            this.currentStation = nextStation;
    }

    public void setPreviousStation() {
        int previousStation = currentStation - 1;
        if (previousStation < minStation) {
            return;
        } else
            this.currentStation = previousStation;
    }


    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void setNextVolume() {
        int nextVolume = currentVolume + 1;
        if (nextVolume > maxVolume) {
            return;
        } else
            this.currentVolume = nextVolume;
    }

    public void setPreviousVolume() {
        int previousVolume = currentVolume - 1;
        if (previousVolume < minVolume) {
            return;
        } else
            this.currentVolume = previousVolume;
    }


    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }
}
