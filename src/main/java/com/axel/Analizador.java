package com.axel;
public class Analizador{
	public static boolean lexico(String exprecion){
		return exprecion.matches("^(?:\\+|-)?\\d+$");
	}

	public static boolean sintactico(){
		return false;
	}
}

