package Bea;

public class Bea {
	
		  private String nombre;

		  public Bea (String nombre) {
		    this.nombre = nombre;
		  }

		  public void imprimirNombre() {
		    System.out.println("Hola, soy " + this.nombre);
		  }

		  public static void main(String[] args) {
		    Bea obj = new Bea("Bea");
		    obj.imprimirNombre();
		    
		   System.out.println("Mis hobbies son viajar, bailar y cualquier actividad que implique estar con animales"); 

		

		   System.out.println("Mis tres comidas favoritas son pasta, ensaladas y paella"); 

		    
		  }
		
         
          


}

