package Modelo;

import java.io.BufferedReader;
import java.io.FileReader;

public  class Entities {

	public void loadtext () {
	try {
	FileReader fr = new FileReader ("Data/datos.txt");
	
	BufferedReader br = new BufferedReader (fr);
	
	String strCurrentLine;
	while((strCurrentLine= br.readLine())!= null) {
		System.out.println(strCurrentLine);
	
	}
	
	
	}
	
	catch (Exception e) {}
	
			
		
	}
	
	
}