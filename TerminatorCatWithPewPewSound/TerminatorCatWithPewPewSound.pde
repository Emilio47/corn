import ddf.minim.*;
boolean playsound = true;
Minim min = new Minim(this);
AudioSample sound;
PImage catPic;
int x = 321;
int y = 327;
int acceleration = 5;
void setup() {
  sound = min.loadSample("cat-lazer.wav");
  size(700, 700);
  catPic = loadImage("catPic.png");
  catPic.resize(700, 700);
  background(catPic);
}

void draw() {
  if (mousePressed) {
    println("Mouse's x-position: " + mouseX + "\n" + "Mouse's y-position: " + mouseY + "\n");
  }
  fill(#FC0324);
  noStroke();
  ellipse(x, y, 30, 30);
  ellipse(x+88, y, 30, 30);
}
void keyPressed() {
  if (playsound) {
    sound.trigger();
    playsound = false;}
  y+=2*acceleration;

  x+=2*acceleration;

if (x > 700) {
  x = 321;
  y = 327;
  background(catPic);
}
}