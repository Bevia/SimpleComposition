package com.corebaseit.bevia;

/**
 * Created by vbevia on 29/05/16.
 */
public class LEDs {

    //lets make the LEDs pretty simple, should we? you can add any other variables though!

    private String ledsColor;

    public LEDs(String ledsColor) {
        this.ledsColor = ledsColor;

    }

    public String getLedsColor() {
        return ledsColor;
    }

    public void setLedsColor(String ledsColor) {
        this.ledsColor = ledsColor;
    }

}
