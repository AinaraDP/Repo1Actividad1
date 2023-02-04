package Eric;

public class Eric {
	  private String nombre;

	  public Eric(String nombre) {
	    this.nombre = nombre;
	  }

	  public void imprimirNombre() {
	    System.out.println("Hola, soy " + this.nombre);
	  }

	  
	  public static void main(String[] args) {
	    Eric obj = new Eric("Eric");
	    obj.imprimirNombre();
	  }
	}

