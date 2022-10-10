//Se improtó la clase Scanner

import java.util.Scanner;

public class Codigo5 {

	
	
	public static void main (String[] args) {
		
			//Se agregó System.in
		    Scanner s = new Scanner(System.in);
		    System.out.print("Introduzca un número: "); // Correción "
		    String ni = s.nextLine();
		    //String por Int
		    int c = Integer.parseInt(ni);
		    
		    int afo = 0;
		    int noAfo = 0;
		    //Error en variable
		    while (c > 0) {
			  int digito = (int)(c % 10);
		      if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
				afo++;
		      } else {
				noAfo++;
		    }//else
		      
		      
		      c /= 10;
	
		    
		  }//While
		    //Error en la colocación de segmento de codigo
		    if (afo > noAfo) {
		    	//Se cambió variables y mensaje
		      System.out.println("El " + c+ " es un número afortunado.");
		    } else {
		      System.out.println("El " + c + " no es un número afortunado.");
		    }
		
	}//main
	
}//class