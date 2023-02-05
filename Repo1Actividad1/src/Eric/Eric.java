package Eric;

public class Eric {
	  private String nombre;

	  public Eric(String nombre) {
	    this.nombre = nombre;
	  }

	  public void imprimirNombre() {
	    System.out.println("Hola, soy " + this.nombre);
	    System.out.println("Mis hobbies: leer comics, hacer ejercicio y ver peliculas");
<<<<<<< HEAD
	    System.out.println("Mis comidas favoritas son ensalada, pasta y paella");
=======
	    System.out.println("Mis comidas favoritas son: Brocoli, calabacín y lechuga");
>>>>>>> 8d9dbcd8d42253154427adde68e7e1cda66beb3f
	  }

	  
	  public static void main(String[] args) {
	    Eric obj = new Eric("Eric");
	    obj.imprimirNombre();
	  }
	}

