package ej2;

import java.io.File;

public class Main {

	//Programa que diga el directorio actual
	public static void main(String[] args) 
	{
		File directorioActual = new File("");
		System.out.println(directorioActual.getAbsolutePath());

	}

}
