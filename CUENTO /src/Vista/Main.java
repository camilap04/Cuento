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
	PImage PIEDRA;

	int screen;
	
	boolean loboClic;
	
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
		PIEDRA = loadImage ("IMG/PIEDRA.png");

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
			image (ARBOLES, 0,0);
			image (CAPERUCITA, 0,0);
			image (LOBO, 0,0);
			image (HONGO, 0,0);
			image (CANASTA, 0,0);
			image (PIEDRA, 0,0);

			break;

		case 4:
			image (ULTIMAPANTALLA, 0,0);
			
		case 5:
			image (PANTALLADOS, 0,0);

			break;
			
			
			case 6:
				image (PANTALLA1, 0,0);

				break;
				
			case 7 :
				image (PANTALLADOS, 0,0);

				break;

		

		default:
			break;
		}		


	}

	public void mousePressed () {
		
		println (mouseX, mouseY);
		
		switch (screen) {
		case 1:
			
			if (mouseX > 762 && mouseX < 967
					&& mouseY > 408 && mouseY < 449) //CONTINUE
				screen = 2;
			
			
			
			
			break;
		case 2:
			
		
			if (mouseX > 954 && mouseX < 1105
					&& mouseY > 632&& mouseY < 660) //CONTINUE
				screen = 3;
			
			case 3:
			
			
			if (mouseX > 24 && mouseX < 112
					&& mouseY > 626 && mouseY < 672) // Para devolverme de la segunda pantalla a la primera
				screen = 1;
		
			
			case 4:
			
			
			if (mouseX > 38 && mouseX < 126
					&& mouseY > 625 && mouseY < 668) // Para devolverme de la TERCER pantalla a la segunda
				screen = 2;

			break;
		case 5:
		
			if (mouseX > 38 && mouseX < 124
					&& mouseY > 624 && mouseY < 668) // caperucita roja
				
				break;
		
			println("Caperucita");	
			
	
			
			if (mouseX > 422 && mouseX < 565
					&& mouseY > 97 && mouseY < 261) // lobo
				println("lobo");
			
			if (mouseX > 640 && mouseX < 733
					&& mouseY > 569 && mouseY < 689) // canasta
				println("canasta");
			
			if (mouseX > 848 && mouseX < 967
					&& mouseY > 584 && mouseY < 676) // hongo
				println("hongo");
			
			if (mouseX > 654 && mouseX < 801
					&& mouseY > 367 && mouseY < 472) // piedra
				println("Piedra");
				break;


	

			

		default:
			break;
		}		

	}
}
