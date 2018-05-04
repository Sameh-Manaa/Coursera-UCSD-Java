package guimodule;

import processing.core.PApplet;

/**
 *
 * @author same7
 */
public class MyDisplay extends PApplet {
    
    @Override
    public void setup() {
        this.size(200, 200);
        this.background(200, 200, 200);
        fill(255,255,0);
        ellipse(100, 100, 200, 200);
        fill(0,0,0);
        ellipse(60, 55, 30, 50);
        ellipse(140, 55, 30, 50);
        noFill();
        stroke(0, 0, 0);
        strokeWeight(2);
        arc(100, 85, 150, 150, 0 + QUARTER_PI , PI-QUARTER_PI);
        //super.setu
    }
    
    @Override
    public void draw() {
        
    }
    
    public static void main(String[] args) {
        //Add main method for running as application
        PApplet.main(new String[]{"guimodule.MyDisplay"});
    }
    
}
