//Create a new sketch in Processing and add setup() and draw() methods.
//Find an image on the internet and drop it into your sketch. It can be anything as long as it has eyes!
//In your setup() method, import your image using the following code:
PImage face;
void setup(){
  size(180,451);
    face = loadImage("WEEGEE.png");
    background(face);

//Change the code you just entered so that “face.jpg” matches the name of your picture.
//Set the size of your sketch and the size of your image to be the same. Enter the following code between the previous two lines you entered:
   
  
    
}
//In your draw() method, place a white ellipse over the left eye of your image.
//Now add a pupil to the left eye (i.e. the black part).
//Use mouseX and mouseY to move the left pupil when the mouse moves.
//Add a white ellipse over the right eye.
//Add a right pupil and make it move by using mouseX + [some distance] and mouseY + [some distance].
//Here’s the tricky part: stop the pupils from going outside of the eyes! To do this, imagine a rectangle that the pupil should stay within. When mouseX and mouseY goes outside of these bounds, set it back to the boundary. Put this code before you draw the ellipses.
void draw(){
  background(face);
  if(mouseX<42){
    mouseX=42;
  }
  if(mouseX>55){
    mouseX=55;
  }
  if(mouseY<89){
    mouseY=89;
  }
  if(mouseY>92){
    mouseY=92;
  }
 
  fill(255, 255, 255);
ellipse(88, 90, 30, 60);
ellipse(48, 90, 29, 57);
fill(3, 3, 3);
ellipse(mouseX, mouseY, 17, 35);
ellipse(mouseX+40, mouseY+0, 17, 35);

}