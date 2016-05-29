# SimpleComposition
Simple Java Composition example (Always choose Composition over Inheritance)


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
    // notice that the neither the LEDs, nor the batteries nor the push button "is a" flashlight (as for example,
    // a car "is an" automobile, or a dog "is an" animal), but they are components of the flashlight, that is
    // the flash "has a" set of LEDs, "has a" button and "has a" set of batteries!
    //
