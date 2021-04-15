package Vista;

import processing.core.PImage;
import Controlador.Word;
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
	boolean caperucitaClic;
	boolean canastaClic;
	boolean hongoClic;
	boolean piedraClic;
	Word controller;
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

		controller = new Word ();
		loboClic= false;
		caperucitaClic= false;
		canastaClic= false;
		hongoClic= false;
		piedraClic= false;

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
					&& mouseY > 634&& mouseY < 664) //CONTINUE
				screen = 3;
			if (mouseX > 22 && mouseX < 117
					&& mouseY > 624 && mouseY < 670) // Para devolverme de la segunda pantalla a la primera
				screen = 1;

			break;
			
			
			

		case 3:


			if (mouseX > 24 && mouseX < 108
					&& mouseY > 626 && mouseY < 672) // Para devolverme de la segunda pantalla a la primera
				screen = 2;
			if (mouseX > 452 && mouseX < 591
					&& mouseY > 393 && mouseY < 695) // caperucita roja
			{
				caperucitaClic=true;
				controller.selectItem ("Little Red Riding Hood");
				

				
				
				
			}
			if (mouseX > 422 && mouseX < 565
					&& mouseY > 97 && mouseY < 261) // lobo
				{
				loboClic= true;
				controller.selectItem ("wolf");
				}

			if (mouseX > 640 && mouseX < 736
					&& mouseY > 561 && mouseY < 686) // canasta
				{
				canastaClic= true;
				controller.selectItem ("basket");
				}

			if (mouseX > 830 && mouseX < 984
					&& mouseY > 580 && mouseY < 685) // hongo
				{
				hongoClic= true;
				controller.selectItem ("fungus");
				}

			if (mouseX > 654 && mouseX < 801
					&& mouseY > 367 && mouseY < 472) // piedra
				{
				piedraClic= true;
				controller.selectItem ("rocks");
				}
			if (piedraClic && hongoClic && canastaClic && caperucitaClic && loboClic) {
				
				screen=4;
				controller.saveText();
			}
			break;



	

		case 4:


			if (mouseX > 710 && mouseX < 957
					&& mouseY > 317 && mouseY < 362) // Para devolverme de la ULTIMA pantalla al MENU
			{
				screen = 1;
				loboClic= false;
				caperucitaClic= false;
				canastaClic= false;
				hongoClic= false;
				piedraClic= false;

			}
			

			break;
		
		
			

			




		default:
			break;
		}		

	}
}
