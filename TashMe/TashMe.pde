PImage Ninja;
PImage mustache;
void setup() {
  Ninja = loadImage("Ninja.jpeg");
  size(800,600);
  Ninja.resize(800,600);
  mustache = loadImage("mustache.png");
  mustache.resize(300,200);
}
void draw(){
background(Ninja);
if (mousePressed) {
image(mustache,mouseX,mouseY);
}
}