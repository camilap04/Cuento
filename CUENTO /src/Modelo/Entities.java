package Modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public  class Entities {
	private String text;
	public void loadText () {
		try {
			FileReader fr = new FileReader ("Data/datos.txt");

			BufferedReader br = new BufferedReader (fr);

			String strCurrentLine;
			while((strCurrentLine= br.readLine())!= null) {
				text += strCurrentLine + "\n";
			}


		}

		catch (Exception e) {}



	}

	public void replaceWord (String word) {

		text= text.replace(word, word.toUpperCase());

	}
	public void saveText () {
		try 
		{  
			File myObj = new File("Data/edit.txt");
			if (myObj.createNewFile()) {       
				System.out.println("File created: " + myObj.getName());
				
			}
			else {         
				System.out.println("File already exists.");
			}   
			FileWriter myWriter = new FileWriter("Data/edit.txt");
			myWriter.write(text); 
			myWriter.close();
		} catch (IOException e) {      
			System.out.println("An error occurred."); 
			e.printStackTrace(); 

		}	

	}

	public Entities() {
		super();
		// TODO Auto-generated constructor stub
	}


	



}