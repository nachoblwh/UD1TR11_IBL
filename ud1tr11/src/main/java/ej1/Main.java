package ej1;

import java.io.File;

//Programa que muestre todas las entradas del directorio c:\\windows
public class Main {

	public static void main(String[] args) 
	{
		File directorio = new File("C:"+File.separator+"Windows");
		File[] files = directorio.listFiles();
		for(File i : files) {
			System.out.println(i);
		}
	}
	

}
