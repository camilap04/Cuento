package Controlador;

import Modelo.Entities;

public class Word {
private Entities modelo;

public Word() {
	super();
	
	modelo = new Entities ();
	modelo.loadText();
	

}

public void selectItem(String item) {
modelo.replaceWord(item);	
	
}

public void saveText  () {
	modelo.saveText();
	
}


}
