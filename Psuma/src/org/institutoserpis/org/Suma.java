package org.institutoserpis.org;
import java.util.Scanner;
import java.math.BigDecimal;
public class Suma
{
	public static void main(String[]args)
	{
		Scanner tcl=new Scanner(System.in);
		System.out.println("Programa para sumar 2 números");
		System.out.print("Introduce el primero:");
		String primerDato = tcl.nextLine();
		BigDecimal primerNumero=new BigDecimal(primerDato);
		System.out.print("Introduce el segundo:");
		String segundoDato=tcl.nextLine();
		BigDecimal segundoNumero=new BigDecimal(segundoDato);
		
		BigDecimal suma=primerNumero.add(segundoNumero);
		System.out.println("La suma es:"+suma);
		tcl.close();
		
	}
}
