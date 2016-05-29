package com.corebaseit.bevia;

/**
 * Created by vbevia on 29/05/16.
 */
public class TheFlashLight {

    private String flashLightType;
    private String flashLightMaker;
    private String flashLightColor;
    private int flashLightSize;
    /**
     * My 3 components, notice I'm not using inheritance!!
     */
    private PushButton pushButton;  //a component, a push button component!!
    private Batteries batteries;    //a component, a batteries component!!
    private LEDs leDs;              //a component, a LEDs component!!

    //this is the constructor you're going to be calling from Main
    public TheFlashLight(String flashLightType, String flashLightMaker, String flashLightColor, int flashLightSize,
                         PushButton pushButton, Batteries batteries, LEDs leDs) {

        this.flashLightType = flashLightType;
        this.flashLightMaker = flashLightMaker;
        this.flashLightColor = flashLightColor;
        this.flashLightSize = flashLightSize;
        //my components:
        this.pushButton = pushButton;
        this.batteries = batteries;
        this.leDs = leDs;
    }

    public void theFlashLightPushButtonComponent () {
        System.out.println("Push Button characteristics: " + pushButton.getPushButtonColor() + " " + pushButton.getPushButtonType() + " button");
    }

    public void theFlashLightBatteriesComponent () {
        System.out.println("Batteries characteristics: " + batteries.getBatteryBrand() + " " + batteries.getBatteriesSize() + " " +batteries.getTypeOfBatteries());
    }

    public void theFlashLightLEDsComponent () {
        System.out.println("LEDs color: " + leDs.getLedsColor());
    }

    // the accessors:

    public String getFlashLightType() {
        return flashLightType;
    }

    public void setFlashLightType(String flashLightType) {
        this.flashLightType = flashLightType;
    }

    public String getFlashLightMaker() {
        return flashLightMaker;
    }

    public void setFlashLightMaker(String flashLightMaker) {
        this.flashLightMaker = flashLightMaker;
    }

    public String getFlashLightColor() {
        return flashLightColor;
    }

    public void setFlashLightColor(String flashLightColor) {
        this.flashLightColor = flashLightColor;
    }

    public int getFlashLightSize() {
        return flashLightSize;
    }

    public void setFlashLightSize(int flashLightSize) {
        this.flashLightSize = flashLightSize;
    }
}
