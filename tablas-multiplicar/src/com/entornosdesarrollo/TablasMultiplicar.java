package com.entornosdesarrollo;

public class TablasMultiplicar {

	public static void main(String[] args) {
		
		
		System.out.println("¿De qué número quiere visualizar la tabla de multiplicar?");
		
		int opcion = 3;
		
		imprimirTablaDel(opcion);
		
		
	}
	
	public static void imprimirTablaDel(int i) {
		int j = 1;
		while (j <= 10) {
			System.out.println(i+"*"+j+"="+i*j);
			j++;
		}
	}

}
