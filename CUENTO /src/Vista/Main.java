package Vista;

import processing.core.PImage;
import processing.core.PApplet;

public class Main extends PApplet {

	PImage ARBOLES;
	PImage CANASTA;
	PImage CAPERUCITA;
	PImage FONDO;
	PImage HONGO;
	PImage LOBO;
	PImage PANTALLA1;
	PImage PANTALLADOS;
	PImage ULTIMAPANTALLA;

	int screen;

	public static void main(String[] args) {

		String[] processingArgs = {"Main"};
		Main mySketch = new Main();
		PApplet.runSketch(processingArgs, mySketch);

	} // MAIN


	public void settings () {
		size (1152,700);

	} // SETTINGS

	public void setup () {

		ARBOLES = loadImage ("IMG/ARBOLES.png");
		CANASTA = loadImage ("IMG/CANASTA.png");
		CAPERUCITA = loadImage ("IMG/Caperucita.png");
		FONDO = loadImage ("IMG/FONDO.png");
		HONGO = loadImage ("IMG/HONGO.png");
		LOBO = loadImage ("IMG/LOBO.png");
		PANTALLA1 = loadImage ("IMG/PANTALLA1.png");
		PANTALLADOS = loadImage ("IMG/PANTALLADOS.png");
		ULTIMAPANTALLA = loadImage ("IMG/ULTIMAPANTALLA.png");

		screen = 1;
	}

	public void draw () {
		switch (screen) {
		case 1:
			image (PANTALLA1, 0,0);

			break;
		case 2:
			image (PANTALLADOS, 0,0);

			break;
		case 3:
			image (FONDO, 0,0);

			break;

		case 4:
			image (ULTIMAPANTALLA, 0,0);

			break;

		default:
			break;
		}		


	}

	public void mousePressed () {
		
		switch (screen) {
		case 1:
		
			break;
		case 2:
		

			break;
		case 3:
		
			break;

		case 4:
	

			break;

		default:
			break;
		}		

	}
}
