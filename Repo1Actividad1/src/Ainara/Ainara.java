package Ainara;

public class Ainara {
	  private String nombre;

	  public Ainara(String nombre) {
	    this.nombre = nombre;
	  }

	  public void imprimirNombre() {
	    System.out.println("Hola, soy " + this.nombre);
	  }

	  public static void main(String[] args) {
	    Ainara obj = new Ainara("Ainara");
	    obj.imprimirNombre();
	  }
	

}
