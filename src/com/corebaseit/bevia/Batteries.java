package com.corebaseit.bevia;

/**
 * Created by vbevia on 29/05/16.
 */
public class Batteries {

    private String batteriesSize;
    private String typeOfBatteries;
    private String batteryBrand;

    public Batteries(String batteriesSize, String typeOfBatteries, String batteryBrand) {
        this.batteriesSize = batteriesSize;
        this.typeOfBatteries = typeOfBatteries;
        this.batteryBrand = batteryBrand;
    }

    public String getBatteriesSize() {
        return batteriesSize;
    }

    public void setBatteriesSize(String batteriesSize) {
        this.batteriesSize = batteriesSize;
    }

    public String getTypeOfBatteries() {
        return typeOfBatteries;
    }

    public void setTypeOfBatteries(String typeOfBatteries) {
        this.typeOfBatteries = typeOfBatteries;
    }

    public String getBatteryBrand() {
        return batteryBrand;
    }

    public void setBatteryBrand(String batteryBrand) {
        this.batteryBrand = batteryBrand;
    }
}
