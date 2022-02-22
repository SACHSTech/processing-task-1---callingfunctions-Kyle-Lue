import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(210, 255, 173);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  //Creating the ground and the colour it will be 
    fill(0,154,23);
    rect(0,300,400,100);
    
    //Creating the sun 
    fill(247,247,73);
    ellipse(65,65,90,90);
    
    //Creating the house body and colour 
    fill(188,74,60);
    rect(175,175,150,150);
    
    //Creating the roof and colour of roof
    fill(109,114,124);
    triangle(150,175,250,100,350,175);
    
    //Creating door
    fill(186,140,99);
    rect(232,265,40,60);
    
    //Creating windows
    fill(199,227,225);
    rect(190,200,30,30);
    rect(282,200,30,30);
    line(190,215,220,215);
    line(205,200,205,230);
    line(282,215,312,215);
    line(297,200,297,230);
  }
  
  // define other methods down here.
}