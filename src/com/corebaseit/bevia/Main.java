package com.corebaseit.bevia;

public class Main {

    //This is the starting point!!

    //this simple composition example is in reference to a flashlight, we are going to build a flashlight!!
    //
    //             ---      -------/-\
    // -------------| |----/      |o o|
    // |-||||||0|||||||0+|        |o o|
    // --------------------\      |o o|
    //                      -------\-/
    //
    // A flashlight has a set of LEDs
    // A flashlight has a push button
    // A flashlight has a pair of batteries
    // notice that the neither the LEDs, nor the batteries nor the push button "is a" battery (as for example,
    // a car "is an" automobile, or a dog "is an" animal), but they are components of the flashlight, that is
    // the flash "has a" set of LEDs, "has a" button and "has a" set of batteries!
    //

    public static void main(String[] args) {

        //so the first step is creating 3 classes, namely:
        //1) Batteries
        //2) PushButton
        //3) LEDs
        //take a minute to check them out...ok, now move on.

        //Next lets work on the composition of the flashlight:
        //Everything get set-up from here....  ;)
        //1) set up my 3 components, the constructors provides the name of the class to instantiate:
        PushButton flashlightPushButton = new PushButton("black", "SPST");
        Batteries flashlightBatteries = new Batteries("AA", "Alakline", "Duracell");
        LEDs flashlightLEDs = new LEDs("cool white");

        //2) now lets build the flashlight:
        TheFlashLight myPocketFlashLight =
                new TheFlashLight("handheld", "duracell", "blue", 12, flashlightPushButton, flashlightBatteries, flashlightLEDs);

        //3) lest print all the info:
        System.out.println("\n" + "My Flashlight is a " + myPocketFlashLight.getFlashLightSize() +" inch "
                + myPocketFlashLight.getFlashLightColor() + " flashlight "
                + "made by: "  + myPocketFlashLight.getFlashLightMaker());
        //4) call the methods that printout the components data:
        myPocketFlashLight.theFlashLightPushButtonComponent();
        myPocketFlashLight.theFlashLightBatteriesComponent();
        myPocketFlashLight.theFlashLightLEDsComponent();

        //5) we're done.
        //   Now you can create any type of flashlight from here without inheritance and by preserving the components decoupling principle.
        //   Notice how we have decoupled the components object creation from the TheFlashLight class.
        //   Cheers ;)



    }
}
