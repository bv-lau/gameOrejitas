package gameOrejitas;

//import java.util.ArrayList;

import processing.core.PApplet;
import processing.core.PImage;

public class Main extends PApplet {


	public static void main(String[] args) {
		PApplet.main("gameOrejitas.Main");
		// System.out.println("Hello!");
	}

	int[][] map = {

			// 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
			{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, // 1
			{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, // 2
			{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, // 3
			{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, // 4
			{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 }, // 5
			{ 1, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1 }, // 6
			{ 1, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1 }, // 7
			{ 1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1 }, // 8
			{ 1, 1, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 1, 1 }, // 9
			{ 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1 }, // 10
			{ 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0 }, // 11
			{ 1, 1, 0, 1, 1, 0, 0, 1, 0, 0, 1, 1, 0, 1, 1 }, // 12
			{ 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 1 }, // 13
			{ 1, 0, 0, 0, 0, 1, 1, 0, 1, 1, 0, 0, 0, 0, 1 }, // 14
			{ 1, 0, 1, 1, 0, 1, 0, 0, 0, 1, 0, 1, 1, 0, 1 }, // 15
			{ 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 0, 1, 0, 0, 1 }, // 16
			{ 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1 }, // 17
			{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, // 18

	};
	
	// Declare variables
	int screen;
	int value;	// Constant value
	
	boolean buttonStart;
	boolean buttonInstructions;
	boolean buttonPlay;
	boolean buttonBack;
	boolean buttonNext;
	boolean buttonReset;
	
	// Declare images
	PImage start;
	PImage startgame1;
	PImage startgame2;
	PImage instructions1;
	PImage instructions2;
	PImage name;
	PImage instructions;
	PImage back1;
	PImage back2;
	PImage next1;
	PImage next2;
	PImage play1;
	PImage play2;
	PImage game;
	
	
	public void settings() {
		size(570, 684);
	}

	public void setup() {
		
		// Initialize variables
		screen = 0;
		value = 38;
		
		buttonStart = false;
		buttonInstructions = false;
		buttonPlay = false;
		buttonBack = false;
		buttonNext = false;
		buttonReset = false;
		
		// Initialize images
		start = loadImage("START.png");
		startgame1 = loadImage("startgame1.png");
		startgame2 = loadImage("startgame2.png");
		instructions1 = loadImage("instructions1.png");
		instructions2 = loadImage("instructions2.png");
		name = loadImage("NAME.png");
		instructions = loadImage("INSTRUCTIONS.png");
		back1 = loadImage("back1.png");
		back2 = loadImage("back2.png");
		next1 = loadImage("next1.png");
		next2 = loadImage("next2.png");
		play1 = loadImage("play1.png");
		play2 = loadImage("play2.png");
		game = loadImage("GAME.png");	
	}
	
	public void draw() {
		background(0);
		imageMode(CENTER);
		
		switch(screen){
		
		case 0: // Starting screen
			
			// Startup image
			image(start, width / 2, height / 2, width, height);
			
			// Instructions button
			if (buttonInstructions == false) {
				image(instructions1, width / 2 - 100, 589, 163, 43);
			} else {
				image(instructions2, width / 2 - 100, 589, 163, 43);
			}
			
			// Start button
			if (buttonStart == false) {
				image(startgame1, width / 2 + 100, 589, 163, 43);
			} else {
				image(startgame2, width / 2 + 100, 589, 163, 43);
			}
			break;
			
		case 1: // Name screen
			
			// Name image
			image(name, width / 2, height / 2, width, height);
			
			// Instructions button
			if (buttonInstructions == false) {
				image(instructions1, width / 2 - 100, 589, 163, 43);
			} else {
				image(instructions2, width / 2 - 100, 589, 163, 43);
			}
			
			// Play button
			if (buttonPlay == false) {
				image(play1, width / 2 + 100, 589, 163, 43);
			} else {
				image(play2, width / 2 + 100, 589, 163, 43);
			}
			break;
			
		case 2:
			
			// Instructions image
			image(instructions, width / 2, height / 2, width, height);
			
			// Back button
			if (buttonBack == false) {
				image(back1, value, value + 19, value, value);
			} else {
				image(back2, value, value + 19, value, value);
			}
			
			// Next button
			if (buttonNext == false) {
				image(next1, width - value, value + 19, value, value);
			} else {
				image(next2, width - value, value + 19, value, value);
			}
			break;
			
		}
	}
	
	public void mouseMoved() {
		switch (screen) {
		
		case 0: // Starting screen
			if (mouseX > 103 && mouseX < 265 && mouseY > 567 && mouseY < 611) {
				buttonInstructions = true;
			} else {
				buttonInstructions = false;
			}

			if (mouseX > 303 && mouseX < 466 && mouseY > 567 && mouseY < 611) {
				buttonStart = true;
			} else {
				buttonStart = false;
			}
			break;
		
		case 1: // Name screen
			if (mouseX > 103 && mouseX < 265 && mouseY > 567 && mouseY < 611) {
				buttonInstructions = true;
			} else {
				buttonInstructions = false;
			}

			if (mouseX > 303 && mouseX < 466 && mouseY > 567 && mouseY < 611) {
				buttonPlay = true;
			} else {
				buttonPlay = false;
			}
			break;
			
		case 2:
			if (mouseX > 19 && mouseX < 19 + value && mouseY > value && mouseY < value + value) {
				buttonBack = true;
			} else {
				buttonBack = false;
			}

			if (mouseX > width - value - 19 && mouseX < width - 19 && mouseY > value && mouseY < value + value) {
				buttonNext = true;
			} else {
				buttonNext = false;
			}

			break;
			
		}
	}
	
	public void mousePressed() {
		switch (screen) {
		
		case 0: // Starting screen
			if (mouseX > 103 && mouseX < 265 && mouseY > 567 && mouseY < 611) {
				screen = 2;
			}

			if (mouseX > 303 && mouseX < 466 && mouseY > 567 && mouseY < 611) {
				screen = 1;
			}
			break;
		
		case 1: // Name screen
			if (mouseX > 103 && mouseX < 265 && mouseY > 567 && mouseY < 611) {
				screen = 2;
			}

			if (mouseX > 303 && mouseX < 466 && mouseY > 567 && mouseY < 611) {
				screen = 0;
			}
			break;
		case 2:
			if (mouseX > 19 && mouseX < 57 && mouseY > value && mouseY < value + value) {
				screen = 0;
			} 

			if (mouseX > width - value - 19 && mouseX < width - 19 && mouseY > value && mouseY < value + value) {
				//setup();
				screen = 1;
			}
			break;
			
		}
	}
	
}