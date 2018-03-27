package section2;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {

	public static void main(String[] args) {

		// START HERE

		System.out.println("Hello World");
		Robot e34d = new Robot ();
		e34d.penDown();
		e34d.setPenColor(Color.red);
		for (int i = 0; i < 4; i++){
		e34d.move(100);
		e34d.turn(90);
		}