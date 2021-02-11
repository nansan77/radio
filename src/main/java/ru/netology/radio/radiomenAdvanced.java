package ru.netology.radio;

public class radiomenAdvanced {
    private String Station;
    private int maxStation;
    private int minStation;
    private int currentStation;

    private String Volume;
    private int maxVolume;
    private int minVolume;
    private int currentVolume;
    private boolean on;

    public String getStation() {
        return Station;
    }

    public void setStation(String station) {
        Station = station;
    }

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
        if (currentStation < minStation){
            return;
    }
        if (currentStation > maxStation){
            return;
        }
        this.currentStation = currentStation;
    }
    public void setNextStation() {
        int nextStation = currentStation + 1;
        if (nextStation > maxStation) {
            this.currentStation = minStation;
        } else
            this.currentStation = nextStation;
    }

    public void setPreviousStation() {
        int previousStation = currentStation - 1;
        if (previousStation < minStation) {
            this.currentStation = maxStation;
        } else
            this.currentStation = previousStation;
    }

    public String getVolume() {
        return Volume;
    }

    public void setVolume(String volume) {
        Volume = volume;
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
        this.currentVolume = currentVolume;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }
    public void setNextVolume() {
        int nextVolume = currentVolume + 1;
        if (nextVolume > maxVolume) {
            this.currentVolume = minVolume;
        } else
            this.currentVolume = nextVolume;
    }

    public void setPreviousVolume() {
        int previousVolume = currentVolume - 1;
        if (previousVolume < minVolume) {
            this.currentVolume = maxStation;
        } else
            this.currentVolume = previousVolume;
    }
}


