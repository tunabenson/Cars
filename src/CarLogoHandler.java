import processing.core.PApplet;
import processing.core.PImage;

public class CarLogoHandler {
    private static int callCount=0;
    private static PApplet app;
    private static void init(PApplet applet){
        app=applet;
    }


    public static PImage getLogoFromName(String name, PApplet applet) throws Exception {
        if(callCount==0) {
            init(applet);
        }
        PImage img;
        switch (name.toLowerCase()){
            case "toyota": img=app.loadImage("../CarLogos/Toyota.png");break;
            case "honda":img=app.loadImage("../CarLogos/Honda.png");break;
            case "nissan" :img=app.loadImage("../CarLogos/Nissan.jpg");break;
            case "mazda":img=app.loadImage("../CarLogos/Mazda.jpg");break;
            case "acura":img=app.loadImage("../CarLogos/Acura.jpg");break;
            case "ford":img=app.loadImage("../CarLogos/Ford.jpg");break;
            case "bmw": img=app.loadImage("../CarLogos/BMW.jpg");break;
            case "tesla": img=app.loadImage("../CarLogos/Tesla.jpg");break;
            default: throw new Exception("car name not recognized");
        }
        callCount++;
        return img;
    }
}
