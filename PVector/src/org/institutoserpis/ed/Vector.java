package org.institutoserpis.ed;

public class Vector {

	public static void main(String[]args){
	 int[]v=new int[]{7,8,9,18,11};
	 System.out.println("v[O]="+v[0]);// muestra el primer valor del vector
	 System.out.println("longitud v[]"+v.length); //muestra la longitud del vector
	 System.out.println("Visitamos todos:");
	 
	 for(int index=0;index<v.length;index++){
		v[index]=v[index]*2;
		System.out.println(v[index]);
	}
	 }
 }