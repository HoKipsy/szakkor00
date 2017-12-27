import processing.core.PApplet; //need to download processing and set it in
                                // File -> Project structure -> Libraries -> + -> Java -> AccesPath\processing-3.3.6\coe\library

public class Demo extends PApplet {

    public static void main(String[] args) {
        System.out.println("Love dat lesson");
        PApplet.main(Demo.class);
    }

    @Override
    public void settings() {
        size(1280, 720);
    }

    @Override
    public void setup() {

    }

    @Override
    public void draw() {
        //if (mousePressed) {
        //    fill(0);
        //} else {
        //    fill(255);
        //}
        //ellipse(mouseX, mouseY, 170, 300);
        background(0xaf00fa);
        scale(2, 1);
        //rotate(90);
        translate(100, 100);    //move

        noStroke();     //nincs korvonala
        color(0xafbcde);
        ellipse(100, 100, 25, 25);

        // HF translate, scale, rotate hogyan lehet egy tetszoleges koordinataju
        //alakzatra felirni 

    }
}
