package abtraccion;

public abstract class Vehiculo {
	/*

	Abstraccion

	En Java, una clase abstracta es una clase que no puede ser implementada directamente (que no puede instanciar), si no que se utiliza como una base para crear subclases mas concretas. Se utiliza para definir una estructura comun y compartir el comportamiento entre las subclases relacionadas.


	*/
	
	//atributos
	
	public String marca;
	public int año;
	
	//metodo concreto
	public void mostrarInfo() {
		System.out.println("Mi auto es de la marca: " + marca + ", y es del año: " + año);
		
	}
	
	//metodos abstractos
	
	public abstract void acelerar();
	
	public abstract void frenar();
	
}

/*

Abstraccion

En Java, una clase abstracta es una clase que no puede ser implementada directamente (que no puede instanciar), si no que se utiliza como una base para crear subclases mas concretas. Se utiliza para definir una estructura comun y compartir el comportamiento entre las subclases relacionadas.


*/