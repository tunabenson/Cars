package Map;

import processing.core.PApplet;

public class Car {
    //TODO add attributes with visibility modifiers (if private, create getters and setters for them if needed)
    public Car() {
        //TODO fill in constructor: take in parameters as necessary
    }
    public void draw(PApplet applet) {
        //TODO create a draw method to draw the car based on different attributes
        // you can use applet.rect() or applet.ellipse() to represent the car as those shapes
        //feel free to play around with it
        //you can use the CarLogoHandler.getLogoFromName(name) which returns path to car logo image
    }

    public void drive(){
        //TODO add functionality to allow the car to drive (move forward, backwards, right, left)
    }


    public void isCollidingWith(Car other){
        //TODO fill this in with logic to check if 2 Cars are colliding
    }

    //TODO add any additional methods you feel you need to add


}
