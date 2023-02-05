package Juancar;


public class Juancar {

	private String nombre;


	  public Juancar(String nombre) {
	    this.nombre = nombre;
	  }

	  public void imprimirNombre() {
	    System.out.println("Hola, soy " + this.nombre +" mis hobbits son Pippin, Merry y Frodo");
	  }

	  
	  public static void main(String[] args) {
	    Juancar obj = new Juancar("Juancar");
	    obj.imprimirNombre();
	  }
}
