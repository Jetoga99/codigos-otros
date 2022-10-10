import java.util.Scanner;

public class Codigo6 {
	//Se agregó main
	public static void main (String [] args) {
		
		//Falta new
		int[] n = new int[20];
		
		//error en el contador
	    for (int i = 0; i < 20; i++) {
	      n[i] = (int)(Math.random() * 381) + 20;
	      //error en print sys out
	      System.out.print(n[i] + " "); 
	    }
	    
	    //printl println
	    System.out.println("\n¿Qué números quiere resaltar? ");
	    System.out.print("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
	    //Se agrega scanner 
	    
	    Scanner s = new Scanner(System.in);
	    int opcion = Integer.parseInt(s.nextLine());
	    
	    //Se agrega ?:
	    int multiplo = (opcion == 1) ? 5 : 7;
	    
	    //error en declaración de variables
	    for (int e : n) {
	      if (e % multiplo == 0) {
	        System.out.print("[" + e + "] ");
	        
	      }else {
	    	  //error sys out
	        System.out.print(e + " ");
	      }
	    }
		
	}//main
}//class