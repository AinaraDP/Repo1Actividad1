package Ainara;

public class Ainara {
	  private String nombre;

	  public Ainara(String nombre) {
	    this.nombre = nombre;
	  }

	  public void imprimirNombre() {
	    System.out.println("Hola, soy " + this.nombre);
	    System.out.println("Mis hobbies son : Leer, tocar el piano y correr");
	  }

	  public static void main(String[] args) {
	    Ainara obj = new Ainara("Ainara");
	    obj.imprimirNombre();
	  }
	

}
